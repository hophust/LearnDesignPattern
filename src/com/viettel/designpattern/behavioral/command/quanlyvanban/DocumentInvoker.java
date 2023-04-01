package com.viettel.designpattern.behavioral.command.quanlyvanban;

import java.util.Stack;

// dung stack de luu lai nhung lan them moi hoac xoa
public class DocumentInvoker {
    private Stack<Command> undoCommands = new Stack<>();
    private Stack<Command> redoCommands = new Stack<>();
    private Document document = new Document();

    // lay ra tu undo va day vao redo
    public void undo() {
        if (!undoCommands.isEmpty()) {
            Command cmd = undoCommands.pop();
            cmd.undo();
            redoCommands.push(cmd);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // lay ra tu redo va day vao undo
    public void redo() {
        if (!redoCommands.isEmpty()) {
            Command cmd = redoCommands.pop();
            cmd.redo();
            undoCommands.push(cmd);
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // ghi ra va day vao undo, clear redo
    public void write(String text) {
        Command cmd = new DocumentEditorCommand(document, text);
        undoCommands.push(cmd);
        redoCommands.clear();
    }

    public void read() {
        document.readDocument();
    }
}
