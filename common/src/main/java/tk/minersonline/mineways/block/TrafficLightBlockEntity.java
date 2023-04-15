package tk.minersonline.mineways.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import tk.minersonline.mineways.api.device.AbstractDevice;
import tk.minersonline.mineways.api.device.DeviceProvider;
import tk.minersonline.mineways.api.network.Packet;
import tk.minersonline.mineways.setup.ModBlockEntities;

public class TrafficLightBlockEntity extends BlockEntity implements DeviceProvider {
	private final AbstractDevice device;

	public TrafficLightBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.TRAFFIC_LIGHT.get(), pos, state);
		this.device = new AbstractDevice(this);
	}

	@Override
	public void processPacket(Packet packet) {

	}

	public AbstractDevice getDevice() {
		return device;
	}
}
