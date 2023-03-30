package goodgenerator.network;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

public interface IGG_NetworkHandler {
    void sendToPlayer(GG_Packet aPacket, EntityPlayerMP aPlayer);

    void sendToAllAround(GG_Packet aPacket, TargetPoint aPosition);

    void sendToServer(GG_Packet aPacket);

    void sendPacketToAllPlayersInRange(World aWorld, GG_Packet aPacket, int aX, int aZ);
}