package owmii.powah.block;

import net.minecraft.block.Block;
import owmii.lib.block.AbstractBlock;
import owmii.lib.block.Properties;
import owmii.lib.registry.Registry;
import owmii.powah.Powah;
import owmii.powah.block.cable.CableBlock;
import owmii.powah.block.discharger.EnergyDischargerBlock;
import owmii.powah.block.ender.EnderCellBlock;
import owmii.powah.block.ender.EnderGateBlock;
import owmii.powah.block.energizing.EnergizingOrbBlock;
import owmii.powah.block.energizing.EnergizingRodBlock;
import owmii.powah.block.energycell.EnergyCellBlock;
import owmii.powah.block.furnator.FurnatorBlock;
import owmii.powah.block.hopper.EnergyHopperBlock;
import owmii.powah.block.magmator.MagmatorBlock;
import owmii.powah.block.reactor.ReactorBlock;
import owmii.powah.block.solar.SolarBlock;
import owmii.powah.block.thermo.ThermoBlock;
import owmii.powah.block.transmitter.PlayerTransmitterBlock;

public class Blcks {
    public static final Registry<Block> REG = new Registry<>(Powah.MOD_ID);
    public static final Block ENERGY_CELL_STARTER = REG.register("energy_cell_starter", new EnergyCellBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block ENERGY_CELL_BASIC = REG.register("energy_cell_basic", new EnergyCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block ENERGY_CELL_HARDENED = REG.register("energy_cell_hardened", new EnergyCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block ENERGY_CELL_BLAZING = REG.register("energy_cell_blazing", new EnergyCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block ENERGY_CELL_NIOTIC = REG.register("energy_cell_niotic", new EnergyCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block ENERGY_CELL_SPIRITED = REG.register("energy_cell_spirited", new EnergyCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block ENERGY_CELL_NITRO = REG.register("energy_cell_nitro", new EnergyCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block ENERGY_CELL_CREATIVE = REG.register("energy_cell_creative", new EnergyCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.CREATIVE));
    public static final Block ENDER_CELL_STARTER = REG.register("ender_cell_starter", new EnderCellBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block ENDER_CELL_BASIC = REG.register("ender_cell_basic", new EnderCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block ENDER_CELL_HARDENED = REG.register("ender_cell_hardened", new EnderCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block ENDER_CELL_BLAZING = REG.register("ender_cell_blazing", new EnderCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block ENDER_CELL_NIOTIC = REG.register("ender_cell_niotic", new EnderCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block ENDER_CELL_SPIRITED = REG.register("ender_cell_spirited", new EnderCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block ENDER_CELL_NITRO = REG.register("ender_cell_nitro", new EnderCellBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block CABLE_STARTER = REG.register("energy_cable_starter", new CableBlock(Properties.rockNoSolid(1.0f, 8.0f).doesNotBlockMovement(), Tier.STARTER));
    public static final Block CABLE_BASIC = REG.register("energy_cable_basic", new CableBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.BASIC));
    public static final Block CABLE_HARDENED = REG.register("energy_cable_hardened", new CableBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.HARDENED));
    public static final Block CABLE_BLAZING = REG.register("energy_cable_blazing", new CableBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.BLAZING));
    public static final Block CABLE_NIOTIC = REG.register("energy_cable_niotic", new CableBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.NIOTIC));
    public static final Block CABLE_SPIRITED = REG.register("energy_cable_spirited", new CableBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.SPIRITED));
    public static final Block CABLE_NITRO = REG.register("energy_cable_nitro", new CableBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.NITRO));
    public static final Block ENDER_GATE_STARTER = REG.register("ender_gate_starter", new EnderGateBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block ENDER_GATE_BASIC = REG.register("ender_gate_basic", new EnderGateBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block ENDER_GATE_HARDENED = REG.register("ender_gate_hardened", new EnderGateBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block ENDER_GATE_BLAZING = REG.register("ender_gate_blazing", new EnderGateBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block ENDER_GATE_NIOTIC = REG.register("ender_gate_niotic", new EnderGateBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block ENDER_GATE_SPIRITED = REG.register("ender_gate_spirited", new EnderGateBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block ENDER_GATE_NITRO = REG.register("ender_gate_nitro", new EnderGateBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block ENERGIZING_ORB = REG.register("energizing_orb", new EnergizingOrbBlock(Properties.metalNoSolid(2.0f, 20.0f)));
    public static final Block ENERGIZING_ROD_STARTER = REG.register("energizing_rod_starter", new EnergizingRodBlock(Properties.rockNoSolid(1.0f, 8.0f).doesNotBlockMovement(), Tier.STARTER));
    public static final Block ENERGIZING_ROD_BASIC = REG.register("energizing_rod_basic", new EnergizingRodBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.BASIC));
    public static final Block ENERGIZING_ROD_HARDENED = REG.register("energizing_rod_hardened", new EnergizingRodBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.HARDENED));
    public static final Block ENERGIZING_ROD_BLAZING = REG.register("energizing_rod_blazing", new EnergizingRodBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.BLAZING));
    public static final Block ENERGIZING_ROD_NIOTIC = REG.register("energizing_rod_niotic", new EnergizingRodBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.NIOTIC));
    public static final Block ENERGIZING_ROD_SPIRITED = REG.register("energizing_rod_spirited", new EnergizingRodBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.SPIRITED));
    public static final Block ENERGIZING_ROD_NITRO = REG.register("energizing_rod_nitro", new EnergizingRodBlock(Properties.metalNoSolid(2.0f, 20.0f).doesNotBlockMovement(), Tier.NITRO));
    public static final Block FURNATOR_STARTER = REG.register("furnator_starter", new FurnatorBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block FURNATOR_BASIC = REG.register("furnator_basic", new FurnatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block FURNATOR_HARDENED = REG.register("furnator_hardened", new FurnatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block FURNATOR_BLAZING = REG.register("furnator_blazing", new FurnatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block FURNATOR_NIOTIC = REG.register("furnator_niotic", new FurnatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block FURNATOR_SPIRITED = REG.register("furnator_spirited", new FurnatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block FURNATOR_NITRO = REG.register("furnator_nitro", new FurnatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block MAGMATOR_STARTER = REG.register("magmator_starter", new MagmatorBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block MAGMATOR_BASIC = REG.register("magmator_basic", new MagmatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block MAGMATOR_HARDENED = REG.register("magmator_hardened", new MagmatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block MAGMATOR_BLAZING = REG.register("magmator_blazing", new MagmatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block MAGMATOR_NIOTIC = REG.register("magmator_niotic", new MagmatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block MAGMATOR_SPIRITED = REG.register("magmator_spirited", new MagmatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block MAGMATOR_NITRO = REG.register("magmator_nitro", new MagmatorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block THERMO_STARTER = REG.register("thermo_generator_starter", new ThermoBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block THERMO_BASIC = REG.register("thermo_generator_basic", new ThermoBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block THERMO_HARDENED = REG.register("thermo_generator_hardened", new ThermoBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block THERMO_BLAZING = REG.register("thermo_generator_blazing", new ThermoBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block THERMO_NIOTIC = REG.register("thermo_generator_niotic", new ThermoBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block THERMO_SPIRITED = REG.register("thermo_generator_spirited", new ThermoBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block THERMO_NITRO = REG.register("thermo_generator_nitro", new ThermoBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block SOLAR_PANEL_STARTER = REG.register("solar_panel_starter", new SolarBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block SOLAR_PANEL_BASIC = REG.register("solar_panel_basic", new SolarBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block SOLAR_PANEL_HARDENED = REG.register("solar_panel_hardened", new SolarBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block SOLAR_PANEL_BLAZING = REG.register("solar_panel_blazing", new SolarBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block SOLAR_PANEL_NIOTIC = REG.register("solar_panel_niotic", new SolarBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block SOLAR_PANEL_SPIRITED = REG.register("solar_panel_spirited", new SolarBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block SOLAR_PANEL_NITRO = REG.register("solar_panel_nitro", new SolarBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block REACTOR_STARTER = REG.register("reactor_starter", new ReactorBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block REACTOR_BASIC = REG.register("reactor_basic", new ReactorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block REACTOR_HARDENED = REG.register("reactor_hardened", new ReactorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block REACTOR_BLAZING = REG.register("reactor_blazing", new ReactorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block REACTOR_NIOTIC = REG.register("reactor_niotic", new ReactorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block REACTOR_SPIRITED = REG.register("reactor_spirited", new ReactorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block REACTOR_NITRO = REG.register("reactor_nitro", new ReactorBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block PLAYER_TRANSMITTER_STARTER = REG.register("player_transmitter_starter", new PlayerTransmitterBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block PLAYER_TRANSMITTER_BASIC = REG.register("player_transmitter_basic", new PlayerTransmitterBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block PLAYER_TRANSMITTER_HARDENED = REG.register("player_transmitter_hardened", new PlayerTransmitterBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block PLAYER_TRANSMITTER_BLAZING = REG.register("player_transmitter_blazing", new PlayerTransmitterBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block PLAYER_TRANSMITTER_NIOTIC = REG.register("player_transmitter_niotic", new PlayerTransmitterBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block PLAYER_TRANSMITTER_SPIRITED = REG.register("player_transmitter_spirited", new PlayerTransmitterBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block PLAYER_TRANSMITTER_NITRO = REG.register("player_transmitter_nitro", new PlayerTransmitterBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block ENERGY_HOPPER_STARTER = REG.register("energy_hopper_starter", new EnergyHopperBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block ENERGY_HOPPER_BASIC = REG.register("energy_hopper_basic", new EnergyHopperBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block ENERGY_HOPPER_HARDENED = REG.register("energy_hopper_hardened", new EnergyHopperBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block ENERGY_HOPPER_BLAZING = REG.register("energy_hopper_blazing", new EnergyHopperBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block ENERGY_HOPPER_NIOTIC = REG.register("energy_hopper_niotic", new EnergyHopperBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block ENERGY_HOPPER_SPIRITED = REG.register("energy_hopper_spirited", new EnergyHopperBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block ENERGY_HOPPER_NITRO = REG.register("energy_hopper_nitro", new EnergyHopperBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block ENERGY_DISCHARGER_STARTER = REG.register("energy_discharger_starter", new EnergyDischargerBlock(Properties.rockNoSolid(1.0f, 8.0f), Tier.STARTER));
    public static final Block ENERGY_DISCHARGER_BASIC = REG.register("energy_discharger_basic", new EnergyDischargerBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BASIC));
    public static final Block ENERGY_DISCHARGER_HARDENED = REG.register("energy_discharger_hardened", new EnergyDischargerBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.HARDENED));
    public static final Block ENERGY_DISCHARGER_BLAZING = REG.register("energy_discharger_blazing", new EnergyDischargerBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.BLAZING));
    public static final Block ENERGY_DISCHARGER_NIOTIC = REG.register("energy_discharger_niotic", new EnergyDischargerBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NIOTIC));
    public static final Block ENERGY_DISCHARGER_SPIRITED = REG.register("energy_discharger_spirited", new EnergyDischargerBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.SPIRITED));
    public static final Block ENERGY_DISCHARGER_NITRO = REG.register("energy_discharger_nitro", new EnergyDischargerBlock(Properties.metalNoSolid(2.0f, 20.0f), Tier.NITRO));
    public static final Block ENERGIZED_STEEL = REG.register("energized_steel_block", new AbstractBlock<>(Properties.metal(2.0f, 20.0f)));
    public static final Block BLAZING_CRYSTAL = REG.register("blazing_crystal_block", new AbstractBlock(Properties.metal(2.0f, 20.0f)));
    public static final Block NIOTIC_CRYSTAL = REG.register("niotic_crystal_block", new AbstractBlock(Properties.metal(2.0f, 20.0f)));
    public static final Block SPIRITED_CRYSTAL = REG.register("spirited_crystal_block", new AbstractBlock(Properties.metal(2.0f, 20.0f)));
    public static final Block NITRO_CRYSTAL = REG.register("nitro_crystal_block", new AbstractBlock(Properties.metal(2.0f, 20.0f)));
    public static final Block URANINITE = REG.register("uraninite_block", new AbstractBlock(Properties.metal(2.0f, 20.0f)));
    public static final Block URANINITE_ORE_POOR = REG.register("uraninite_ore_poor", new AbstractBlock(Properties.rock(3.0f, 8.0f)));
    public static final Block URANINITE_ORE = REG.register("uraninite_ore", new AbstractBlock(Properties.rock(3.2f, 8.0f)));
    public static final Block URANINITE_ORE_DENSE = REG.register("uraninite_ore_dense", new AbstractBlock(Properties.rock(4.0f, 8.0f)));
    public static final Block DRY_ICE = REG.register("dry_ice", new AbstractBlock(Properties.rock(2.0f, 8.0f)));
}
