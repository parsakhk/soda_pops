package net.parsa_pouriya.soda_pops.events;


import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.parsa_pouriya.soda_pops.SodaPops;
import net.parsa_pouriya.soda_pops.item.ModItems;

@Mod.EventBusSubscriber(modid = SodaPops.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void convertWaterToSodaWaterWhenRightClickWithWaterBottle(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getEntity();
        ItemStack itemStack = event.getItemStack();
        BlockState clickedBlock = event.getLevel().getBlockState(event.getPos());
        if(!event.getEntity().level.isClientSide()) {
            if(player.getMainHandItem().getItem() == Items.POTION) {
                //add block (kari kon faghat rooye campfire va fire etefagh biofte)
                if(clickedBlock.getBlock() == Blocks.CAMPFIRE); {
                    itemStack.shrink(1);
                    player.getInventory().add(new ItemStack(ModItems.SODA_WATER_BOTTLE.get()));
                    player.swing(InteractionHand.MAIN_HAND);
                }
            }
        }
    }
}
