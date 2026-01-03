package me.bounser.nascraft.inventorygui;

import org.bukkit.Material;
import java.util.List;

public class CustomButton {

    private final int id; // optional numeric id from yaml key
    private final int slot;
    private final Material material;
    private final int quantity;
    private final String name; // legacy color codes allowed (&)
    private final List<String> lore; // legacy color codes allowed (&)
    private final List<String> commandsOnClick; // commands without leading '/'
    private final boolean closeOnClick;

    public CustomButton(int id,
                        int slot,
                        Material material,
                        int quantity,
                        String name,
                        List<String> lore,
                        List<String> commandsOnClick,
                        boolean closeOnClick) {
        this.id = id;
        this.slot = slot;
        this.material = material;
        this.quantity = quantity;
        this.name = name;
        this.lore = lore;
        this.commandsOnClick = commandsOnClick;
        this.closeOnClick = closeOnClick;
    }

    public int getId() { return id; }
    public int getSlot() { return slot; }
    public Material getMaterial() { return material; }
    public int getQuantity() { return quantity; }
    public String getName() { return name; }
    public List<String> getLore() { return lore; }
    public List<String> getCommandsOnClick() { return commandsOnClick; }
    public boolean isCloseOnClick() { return closeOnClick; }
}
