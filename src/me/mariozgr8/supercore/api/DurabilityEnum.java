package me.mariozgr8.supercore.api;

public enum DurabilityEnum {
	WHITE((short) 0), 
	ORANGE((short) 1), 
	MAGENDA((short) 2), 
	LIGHT_BLUE((short) 3), 
	YELLOW((short) 4), 
	LIME((short) 5),
	PINK((short) 6),
	GRAY((short) 7),
	LIGHT_GRAY((short) 8),
	CYAN((short) 9), 
	PURPLE((short) 10), 
	BLUE((short) 11), 
	BROWN((short) 12), 
	GREEN((short) 13), 
	RED((short) 14),
	BLACK((short) 15);
	
	
	private short durability;
	private DurabilityEnum(short durability) {
		this.durability = durability;
	}
	
	public short getDurability() {
		return this.durability;
	}
	
}
