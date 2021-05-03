package org.example.main;

import io.javalin.Javalin;
import org.example.Toaster.Toaster;
import org.example.Toaster.ToasterDB;

public class HelloJavelin {
    public static void main(String[] args) {
        ToasterDB data = new ToasterDB();
        Javalin app = Javalin.create().start(8001);
        app.get("/toaster/:id",ctx -> {
            ctx.json(data.getToaster(Integer.parseInt(ctx.pathParam("id"))));
        });
        app.get("/toaster",ctx -> {
            ctx.json(data.getToasters());
        });
        app.post("/toaster", ctx -> {
            Toaster toaster = ctx.bodyAsClass(Toaster.class);
            toaster = data.addToaster(toaster);
            ctx.json(toaster);
        });
        app.put("/toaster",ctx -> {
            Toaster toaster = ctx.bodyAsClass(Toaster.class);
            toaster = data.updateToaster(toaster);
            ctx.json(toaster);
        });
        app.delete("/toaster/:id",ctx -> {
            int id = Integer.parseInt(ctx.pathParam("id"));
            data.deleteToaster(id);
            ctx.result("Toaster with id " + id + " removed successfully");
        });
    }
}
