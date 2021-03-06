package net.morimori.yjsnpimod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.ArrayList;
import java.util.List;

public class YJSoundEvents {

    public static List<SoundEvent> MOD_SOUNDS = new ArrayList<SoundEvent>();

    public static final SoundEvent YJ_BUTTIPA = register("yj.buttipa");
    public static final SoundEvent YJ_DASOUTOOMOEBA = register("yj.dasoutoomoeba");
    public static final SoundEvent YJ_DEDEMASUYO = register("yj.dedemasuyo");
    public static final SoundEvent YJ_FA = register("yj.fa");
    public static final SoundEvent YJ_FOOKIMATII = register("yj.fookimatii");
    public static final SoundEvent YJ_GAKUSEIDESU = register("yj.gakuseidesu");
    public static final SoundEvent YJ_HORAHORAHORA = register("yj.horahorahora");
    public static final SoundEvent YJ_HUN = register("yj.hun");
    public static final SoundEvent YJ_IIYOKOIYO = register("yj.iiyokoiyo");
    public static final SoundEvent YJ_IKISUGI = register("yj.ikisugi");
    public static final SoundEvent YJ_KATAKU = register("yj.kataku");
    public static final SoundEvent YJ_MAZUUTISAXA = register("yj.mazuutisaxa");
    public static final SoundEvent YJ_NIJUYONSAI = register("yj.nijuyonsai");
    public static final SoundEvent YJ_NNA = register("yj.nna");
    public static final SoundEvent YJ_NU = register("yj.nu");
    public static final SoundEvent YJ_NUWATIKARETA = register("yj.nuwatikareta");
    public static final SoundEvent YJ_ON = register("yj.on");
    public static final SoundEvent YJ_ONAON = register("yj.onaon");
    public static final SoundEvent YJ_OSUONEGAI = register("yj.osuonegai");
    public static final SoundEvent YJ_SYU = register("yj.syu");
    public static final SoundEvent YJ_TAIZYUANDSINTYOU = register("yj.taizyuandsintyou");
    public static final SoundEvent YJ_YARIMASUNEXE = register("yj.yarimasunexe");
    public static final SoundEvent YJ_YOKUWAKARANAKATTADESU = register("yj.yokuwakaranakattadesu");
    public static final SoundEvent YJ_ZA = register("yj.za");
    public static final SoundEvent YJ_OTTODAIJOUBUKA = register("yj.ottodaijoubuka");
    public static final SoundEvent YJ_BUTTIPA_MIZIKAME = register("yj.buttipa_mizikame");


    public static final SoundEvent YJ_BREAK = register("yj.break");
    public static final SoundEvent YJ_PLACE = register("yj.place");
    public static final SoundEvent YJ_STEP = register("yj.step");
    public static final SoundEvent YJ_HIT = register("yj.hit");
    public static final SoundEvent YJ_FALL = register("yj.fall");
    public static final SoundEvent YJ_EQUIP = register("yj.equip");

    public static final SoundEvent YJ_PROLIFERATION = register("yj.proliferation");
    public static final SoundEvent YJ_ANTIPROLIFERATION = register("yj.antiproliferation");
    public static final SoundEvent YJ_DAMEGE = register("yj.damege");
    public static final SoundEvent YJ_OVERWRITE = register("yj.overwrite");
    public static final SoundEvent YJ_ATTACK = register("yj.attack");

    public static final SoundEvent MEZIKARA_ALL = register("mezikara.all");
    public static final SoundEvent MEZIKARA_N1 = register("mezikara.n1");
    public static final SoundEvent MEZIKARA_N2 = register("mezikara.n2");
    public static final SoundEvent MEZIKARA_N3 = register("mezikara.n3");
    public static final SoundEvent MEZIKARA_HONTAI = register("mezikara.hontai");
    public static final SoundEvent MEZIKARA_MAEBURI = register("mezikara.maeburi");
    public static final SoundEvent MEZIKARA_NS = register("mezikara.ns");

    public static final SoundEvent TON_ALL = register("ton.all");
    public static final SoundEvent TON_SEKAINOTON = register("ton.sekainoton");
    public static final SoundEvent TON_A1 = register("ton.a1");
    public static final SoundEvent TON_A2 = register("ton.a2");
    public static final SoundEvent TON_A3 = register("ton.a3");
    public static final SoundEvent TON_A4 = register("ton.a4");
    public static final SoundEvent TON_STAGGER = register("ton.stagger");

    public static final SoundEvent CYCLOPS_POPOPOPO = register("cyclops.popopopo");
    public static final SoundEvent CYCLOPS_AIKISO = register("cyclops.aikiso");
    public static final SoundEvent CYCLOPS_BADY = register("cyclops.bady");
    public static final SoundEvent CYCLOPS_CAPTURE = register("cyclops.capture");
    public static final SoundEvent CYCLOPS_EVERY = register("cyclops.every");
    public static final SoundEvent CYCLOPS_NAZOOTO = register("cyclops.nazooto");
    public static final SoundEvent CYCLOPS_SANDSTOME = register("cyclops.sandstome");

    public static final SoundEvent CYCLOPS_SANGRASSED = register("cyclops.sangrassed");

    private static SoundEvent register(String name) {
        SoundEvent se = new SoundEvent(new ResourceLocation(YJSNPIMOD.MODID, name)).setRegistryName(name);
        MOD_SOUNDS.add(se);
        return se;
    }
}
