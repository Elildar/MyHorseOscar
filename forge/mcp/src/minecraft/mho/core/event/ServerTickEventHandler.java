package mho.core.event;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickEventHandler implements ITickHandler {

	/**private void onPlayerTick(EntityPlayer player) 
	{
		if(player.getCurrentItemOrArmor(0) != null)
		{
			ItemStack hand = player.getCurrentItemOrArmor(0);
			
			if(hand.getItem() == mho.AKey){
				player.addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 100, 0)));
			}
		}
	}**/
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		/**if(type.equals(EnumSet.of(TickType.PLAYER)))
		{
			onPlayerTick((EntityPlayer) tickData[0]);
		}**/
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub

	}

	@Override
	public EnumSet<TickType> ticks() {
		/**return EnumSet.of(TickType.PLAYER, TickType.SERVER);**/
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}
}
