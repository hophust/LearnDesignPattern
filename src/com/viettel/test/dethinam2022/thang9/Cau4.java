package com.viettel.test.dethinam2022.thang9;

import java.io.File;
import java.io.FilePermission;
import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Cau4 {
    /*List<File> dir = new ArrayList<File>();
    public <R> List<R> executeFunction(Function<File, R> fun){
        List<R> l = new ArrayList<R>();
        for(File f : dir){
            Permission perm = new FilePermission(f.getPath(), "read");
            PermissionCollection perms = perm.newPermissionCollection();
            perms.add(perm);

            AccessController.doPrivileged(new PrivilegedAction<Void>()

                                          {
                                              public Void run () {
                                                  l.add(fun.apply(f));
                                                  return null;
                                              }
                                          },

                    newAccessControlContext(
                            new ProtectionDomain[] {
                                    newProtectionDomain(null, perms)
                            }
                    )
            );
        }
        return l;
    }
    public static void main(String[] args) {
        
    }*/
}
