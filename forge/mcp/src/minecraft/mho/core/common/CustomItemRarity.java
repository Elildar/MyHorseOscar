package mho.core.common;


public class CustomItemRarity {

    // Colour Value Guide
    // 0 = Black
    // 1 = Dark Blue
    // 2 = Green
    // 3 = Cyan
    // 4 = Dark Red
    // 5 = Purple
    // 6 = Orange
    // 7 = Light Grey
    // 8 = Dark Grey
    // 9 = Blue
    // 10 = Light Green
    // 11 = Light Cyan
    // 12 = Light Red
    // 13 = Pink
    // 14 = Yellow
    // 15 = White

    public static final int COLOR_JUNK = 7;
    public static final int COLOR_NORMAL = 15;
    public static final int COLOR_UNCOMMON = 10;
    public static final int COLOR_MAGICAL = 9;
    public static final int COLOR_RARE = 14;
    public static final int COLOR_EPIC = 5;
    public static final int COLOR_LEGENDARY = 6;

    public static final String JUNK = "custom_junk";
    public static final String NORMAL = "custom_normal";
    public static final String UNCOMMON = "custom_uncommon";
    public static final String MAGICAL = "custom_magical";
    public static final String RARE = "custom_rare";
    public static final String EPIC = "custom_epic";
    public static final String LEGENDARY = "custom_legendary";

    public static final String DISPLAY_NAME_JUNK = "Junk";
    public static final String DISPLAY_NAME_NORMAL = "Normal";
    public static final String DISPLAY_NAME_UNCOMMON = "Uncommon";
    public static final String DISPLAY_NAME_MAGICAL = "Magical";
    public static final String DISPLAY_NAME_RARE = "Rare";
    public static final String DISPLAY_NAME_EPIC = "Epic";
    public static final String DISPLAY_NAME_LEGENDARY = "Legendary";

	public static String getRarity(int rarity)
	{ 
		switch (rarity) {
        case 1:  return CustomItemRarity.JUNK;
        case 2:  return CustomItemRarity.NORMAL;
        case 3:  return CustomItemRarity.UNCOMMON;
        case 4:  return CustomItemRarity.MAGICAL;
        case 5:  return CustomItemRarity.RARE;
        case 6:  return CustomItemRarity.EPIC;
        case 7:  return CustomItemRarity.LEGENDARY;
        default: return CustomItemRarity.NORMAL;
        }
	}
}