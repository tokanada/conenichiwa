package com.tokanada.conenichiwa;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConenichiwaMain implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final Identifier CONE1 = new Identifier("conenichiwa:cone1");
	public static SoundEvent CONE1_EVENT = new SoundEvent(CONE1);

	public static final Identifier CONE2 = new Identifier("conenichiwa:cone2");
	public static SoundEvent CONE2_EVENT = new SoundEvent(CONE2);

	public static final Identifier CONE3 = new Identifier("conenichiwa:cone3");
	public static SoundEvent CONE3_EVENT = new SoundEvent(CONE3);

	public static final Identifier CONE4 = new Identifier("conenichiwa:cone4");
	public static SoundEvent CONE4_EVENT = new SoundEvent(CONE4);

	public static final Identifier CONE5 = new Identifier("conenichiwa:cone5");
	public static SoundEvent CONE5_EVENT = new SoundEvent(CONE5);

	public static final Identifier CONE6 = new Identifier("conenichiwa:cone6");
	public static SoundEvent CONE6_EVENT = new SoundEvent(CONE6);

	public static final Identifier CONE7 = new Identifier("conenichiwa:cone7");
	public static SoundEvent CONE7_EVENT = new SoundEvent(CONE7);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.SOUND_EVENT, ConenichiwaMain.CONE1, CONE1_EVENT);
		Registry.register(Registry.SOUND_EVENT, ConenichiwaMain.CONE2, CONE2_EVENT);
		Registry.register(Registry.SOUND_EVENT, ConenichiwaMain.CONE3, CONE3_EVENT);
		Registry.register(Registry.SOUND_EVENT, ConenichiwaMain.CONE4, CONE4_EVENT);
		Registry.register(Registry.SOUND_EVENT, ConenichiwaMain.CONE5, CONE5_EVENT);
		Registry.register(Registry.SOUND_EVENT, ConenichiwaMain.CONE6, CONE6_EVENT);
		Registry.register(Registry.SOUND_EVENT, ConenichiwaMain.CONE7, CONE7_EVENT);
	}
}
