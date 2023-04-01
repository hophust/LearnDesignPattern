package com.viettel.test.practice.de1;

import java.io.File;
import java.io.FilePermission;
import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Cau4 {
    public static void main(String[] args) {

    }

    List<File> files = new ArrayList<File>();

    public <R> List<R> executeFunction(Function<File, R> fun) {
        List<R> l = new ArrayList<R>();
        for (File f : files) {
            Permission perm = new FilePermission(f.getPath(), "read");
            PermissionCollection perms = perm.newPermissionCollection();
            perms.add(perm);

            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                                              public Void run() {
                                                  l.add(fun.apply(f));
                                                  return null;
                                              }
                                          },
                    new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, perms)}));
        }
        return l;
    }
}
