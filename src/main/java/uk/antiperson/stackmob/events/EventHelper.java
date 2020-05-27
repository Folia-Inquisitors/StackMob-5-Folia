package uk.antiperson.stackmob.events;

import org.bukkit.Bukkit;
import uk.antiperson.stackmob.entity.StackEntity;

public class EventHelper {

    public static StackMergeEvent callStackMergeEvent(StackEntity first, StackEntity nearby) {
        StackMergeEvent event = new StackMergeEvent(first, nearby);
        Bukkit.getPluginManager().callEvent(event);
        return event;
    }
}
