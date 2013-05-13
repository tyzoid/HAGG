package me.C0nsole.HAGG;

import java.util.List;
import org.bukkit.event.Listener;

public class HAGGListener implements Listener {
    private main plugin;
    private List<String> peopleingame;

    public HAGGListener(main instance) {
            plugin = instance;
            peopleingame = plugin.getList();
    }

}
