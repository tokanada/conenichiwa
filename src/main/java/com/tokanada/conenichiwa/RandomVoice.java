package com.tokanada.conenichiwa;

import net.minecraft.sound.SoundEvent;

import java.util.Random;

public class RandomVoice {

    private static final SoundEvent[] coneVoices = new SoundEvent[]{ConenichiwaMain.CONE1_EVENT, ConenichiwaMain.CONE2_EVENT, ConenichiwaMain.CONE3_EVENT, ConenichiwaMain.CONE4_EVENT, ConenichiwaMain.CONE5_EVENT, ConenichiwaMain.CONE6_EVENT, ConenichiwaMain.CONE7_EVENT};
    private static final SoundEvent[] breakVoices = new SoundEvent[]{ConenichiwaMain.BREAK1_EVENT, ConenichiwaMain.BREAK2_EVENT, ConenichiwaMain.BREAK3_EVENT, ConenichiwaMain.BREAK4_EVENT};


    public static SoundEvent getConeRandomVoice() {
        int rnd = new Random().nextInt(coneVoices.length);
        return coneVoices[rnd];
    }

    public static SoundEvent getBreakRandomVoice() {
        int rnd = new Random().nextInt(breakVoices.length);
        return breakVoices[rnd];
    }
}
