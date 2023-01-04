package com.tokanada.conenichiwa;

import net.minecraft.sound.SoundEvent;

import java.util.Random;

public class RandomVoice {

    private static final SoundEvent[] coneVoices = new SoundEvent[]{ConenichiwaMain.CONE1_EVENT, ConenichiwaMain.CONE2_EVENT, ConenichiwaMain.CONE3_EVENT, ConenichiwaMain.CONE4_EVENT, ConenichiwaMain.CONE5_EVENT, ConenichiwaMain.CONE6_EVENT, ConenichiwaMain.CONE7_EVENT};

    public static SoundEvent getRandomVoice() {
        int rnd = new Random().nextInt(coneVoices.length);
        return coneVoices[rnd];
    }
}
