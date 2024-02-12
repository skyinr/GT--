package org.arbor.gtnn.data.lang.cn;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import org.arbor.gtnn.api.registry.CNLangProvider;

import static org.arbor.gtnn.data.GTNNMaterials.*;

public class MaterialLang {
    public static void init(CNLangProvider provider) {
        provider.add("tagprefix.blackstone", "嵌%s黑石");
        provider.add("tagprefix.glacio_stone", "坚冰岩%s矿石");
        provider.add("tagprefix.mars_stone", "深红岩%s矿石");
        provider.add("tagprefix.mercury_stone", "旱海岩%s矿石");
        provider.add("tagprefix.moon_stone", "月岩%s矿石");
        provider.add("tagprefix.soul_soil", "含%s灵魂土");
        provider.add("tagprefix.venus_stone", "锃金岩%s矿石");
        materials(provider);
        jeiOreveins(provider);
    }

    private static void materials(CNLangProvider provider) {
        provider.add(getMaterialName(AndesiteAlloy), "安山合金");
        provider.add(getMaterialName(SpaceNeutronium), "中子");
        provider.add(getMaterialName(Infinity), "无尽");
        provider.add(getMaterialName(InfinityCatalyst), "无尽催化剂");
        provider.add(getMaterialName(Desh), "戴斯");
        provider.add(getMaterialName(Ostrum), "紫金");
        provider.add(getMaterialName(Calorite), "耐热金属");
        provider.add(getMaterialName(RP1), "RP-1混合燃料");
        provider.add(getMaterialName(RP1RocketFuel), "RP-1火箭燃料");
        provider.add(getMaterialName(Kerosene), "煤油");
        provider.add(getMaterialName(DenseHydrazineMixedFuel), "浓缩肼混合燃料");
        provider.add(getMaterialName(Hydrazine), "肼");
        provider.add(getMaterialName(HydrogenPeroxide), "过氧化氢");
        provider.add(getMaterialName(EthylAnthraQuinone), "乙基蒽醌");
        provider.add(getMaterialName(EthylAnthraHydroQuinone), "乙基蒽醌醇");
        provider.add(getMaterialName(Anthracene), "蒽");
        provider.add(getMaterialName(MethylhydrazineNitrateRocketFuel), "CN3H7O3火箭燃料");
        provider.add(getMaterialName(MethylHydrazine), "甲基肼");
        provider.add(getMaterialName(UDMHRocketFuel), "H8N4C2O4火箭燃料");
        provider.add(getMaterialName(UDMH), "偏二甲肼");
        provider.add(getMaterialName(OrangeMetalCatalyst), "橙色金属催化剂");
        provider.add(getMaterialName(PhthalicAnhydride), "邻苯二甲酸酐");
        provider.add(getMaterialName(VanadiumPentoxide), "五氧化二钒");
        provider.add(getMaterialName(BlackMatter), "黑物质");
        provider.add(getMaterialName(Cerrobase140), "铋铅合金140");
        provider.add(getMaterialName(ManaSteel), "魔力钢");
        provider.add(getMaterialName(TerraSteel), "泰拉钢");
        provider.add(getMaterialName(Elementium), "源质钢");
        provider.add(getMaterialName(ShadowSteel), "暗影钢");
        provider.add(getMaterialName(RefinedRadiance), "光辉石");
        provider.add(getMaterialName(PlatinumSalt), "铂盐");
        provider.add(getMaterialName(PlatinumSlag), "铂渣");
        provider.add(getMaterialName(RefinedPlatinumSalt), "精炼铂盐");
        provider.add(getMaterialName(PalladiumSalt), "钯盐");
        provider.add(getMaterialName(RhodiumFilterCake), "铑滤饼");
        provider.add(getMaterialName(RhodiumNitrate), "硝酸铑");
        provider.add(getMaterialName(RoughlyRhodiumMetal), "粗制铑金属");
        provider.add(getMaterialName(PalladiumMetal), "钯金属");
        provider.add(getMaterialName(SodiumRutheniate), "钌酸钠");
        provider.add(getMaterialName(IridiumDioxide), "二氧化铱");
        provider.add(getMaterialName(MetalSludge), "金属泥渣");
        provider.add(getMaterialName(ConcentratedPlatinum), "浓缩铂");
        provider.add(getMaterialName(RhodiumSulfateGas), "硫酸铑");
        provider.add(getMaterialName(PalladiumRichAmmonia), "富钯氨");
        provider.add(getMaterialName(RhodiumSalt), "铑盐");
        provider.add(getMaterialName(RutheniumTetroxideHot), "热四氧化钌");
        provider.add(getMaterialName(RutheniumTetroxideLQ), "四氧化钌");
        provider.add(getMaterialName(ReprecipitatedRhodium), "再沉淀铑");
        provider.add(getMaterialName(AcidicIridium), "酸性铱");
        provider.add(getMaterialName(PlatinumMetal), "铂金属");
        provider.add(getMaterialName(SodiumPyrosulfate), "焦硫酸钠");
        provider.add(getMaterialName(SodiumFormate), "甲酸钠");
        provider.add(getMaterialName(FormicAcid), "甲酸");
        provider.add(getMaterialName(SodiumSulfate), "硫酸钠");
        provider.add(getMaterialName(SodiumNitrate), "硝酸钠");
        provider.add(getMaterialName(ZincSulfate), "硫酸锌");
        provider.add(getMaterialName(Kaolinite), "高岭石");
        provider.add(getMaterialName(Dolomite), "白云石");
        provider.add(getMaterialName(Wollastonite), "硅灰石");
        provider.add(getMaterialName(ArcaneCrystal), "神秘水晶");
        provider.add(getMaterialName(NaquadahOxideMixture), "氧化硅岩混合物");
        provider.add(getMaterialName(EnrichedNaquadahOxideMixture), "氧化富集硅岩混合物");
        provider.add(getMaterialName(NaquadriaOxideMixture), "氧化超能硅岩混合物");
        provider.add(getMaterialName(HexafluorideEnrichedNaquadahSolution), "六氟化富集硅岩溶液");
        provider.add(getMaterialName(XenonHexafluoroEnrichedNaquadate), "六氟氙酸富集硅岩");
        provider.add(getMaterialName(PalladiumOnCarbon), "钯碳催化剂");
        provider.add(getMaterialName(GoldTrifluoride), "三氟化金");
        provider.add(getMaterialName(EnrichedNaquadahResidueSolution), "富集硅岩残余物溶液");
        provider.add(getMaterialName(XenoauricFluoroantimonicAcid), "氟锑酸二氙");
        provider.add(getMaterialName(GoldChloride), "氯化金");
        provider.add(getMaterialName(BromineTrifluoride), "三氟化溴");
        provider.add(getMaterialName(HexafluorideNaquadriaSolution), "六氟化超能硅岩溶液");
        provider.add(getMaterialName(RadonDifluoride), "二氟化氡");
        provider.add(getMaterialName(RadonNaquadriaOctafluoride), "八氟超能硅岩酸氡");
        provider.add(getMaterialName(NaquadriaResidueSolution), "超能硅岩残余物溶液");
        provider.add(getMaterialName(CaesiumFluoride), "氟化铯");
        provider.add(getMaterialName(XenonTrioxide), "三氧化氙");
        provider.add(getMaterialName(CaesiumXenontrioxideFluoride), "二氟三氧氙酸铯");
        provider.add(getMaterialName(NaquadriaCaesiumXenonnonfluoride), "九氟氙酸超能硅岩铯");
        provider.add(getMaterialName(RadonTrioxide), "三氧化氡");
        provider.add(getMaterialName(NaquadriaCaesiumfluoride), "二氟超能硅岩酸铯");
        provider.add(getMaterialName(NitrosoniumOctafluoroxenate), "八氟氙酸亚硝酰");
        provider.add(getMaterialName(NitrylFluoride), "硝酰氟");
        provider.add(getMaterialName(AcidicNaquadriaCaesiumfluoride), "硫酸二氟超能硅岩酸铯");
    }

    private static void jeiOreveins(CNLangProvider provider) {
        provider.add("gtceu.jei.ore_vein.kaolinite_vein", "高岭石矿脉");
        provider.add("gtceu.jei.ore_vein.wollastonite_vein", "白云石矿脉");
        provider.add("gtceu.jei.ore_vein.galena_vein_tf", "方铅矿脉");
        provider.add("gtceu.jei.ore_vein.sapphire_vein_tf", "蓝宝石矿脉");
        provider.add("gtceu.jei.ore_vein.olivine_vein_tf", "橄榄石矿脉");
        provider.add("gtceu.jei.ore_vein.nickel_vein_tf", "镍矿脉");
        provider.add("gtceu.jei.ore_vein.diamond_vein_tf", "钻石矿脉");
        provider.add("gtceu.jei.ore_vein.lapis_vein_tf", "青金石矿脉");
        provider.add("gtceu.jei.ore_vein.molybdenite_vein_tf", "辉钼矿脉");
        provider.add("gtceu.jei.ore_vein.coal_vein_tf", "煤矿脉");
        provider.add("gtceu.jei.ore_vein.lubricant_vein_tf", "皂石矿脉");
        provider.add("gtceu.jei.ore_vein.gold_vein_tf", "金矿脉");
        provider.add("gtceu.jei.ore_vein.iron_vein_tf", "铁矿脉");
        provider.add("gtceu.jei.ore_vein.apatite_vein_tf", "磷灰石矿脉");
        provider.add("gtceu.jei.ore_vein.salts_vein_tf", "盐矿脉");
        provider.add("gtceu.jei.ore_vein.cassiterite_vein_tf", "锡石矿脉");
        provider.add("gtceu.jei.ore_vein.monazite_vein_n", "独居石矿脉");
        provider.add("gtceu.jei.ore_vein.bauxite_vein", "铝土矿脉");
        provider.add("gtceu.jei.ore_vein.ilmenite_vein", "钛铁矿脉");
        provider.add("gtceu.jei.ore_vein.quartzite_vein", "石英岩矿脉");
        provider.add("gtceu.jei.ore_vein.molybdenum_vein_ad", "钼矿脉");
        provider.add("gtceu.jei.ore_vein.galena_vein_ad", "方铅矿脉");
        provider.add("gtceu.jei.ore_vein.copper_vein_ad", "铜矿脉");
        provider.add("gtceu.jei.ore_vein.cassiterite_vein_ad", "锡石矿脉");
        provider.add("gtceu.jei.ore_vein.desh_vein_ad", "戴斯矿脉");
        provider.add("gtceu.jei.ore_vein.ostrum_vein_ad", "紫金矿脉");
        provider.add("gtceu.jei.ore_vein.arsenic_vein_ad", "砷矿脉");
        provider.add("gtceu.jei.ore_vein.pitchblende_vein_ad", "沥青铀矿脉");
        provider.add("gtceu.jei.ore_vein.tuff_uraninite_vein_ad", "晶质铀矿脉");
        provider.add("gtceu.jei.ore_vein.scheelite_vein_ad", "白钨矿脉");
        provider.add("gtceu.jei.ore_vein.sulfur_vein_ad", "硫矿脉");
        provider.add("gtceu.jei.ore_vein.redstone_vein_ad", "红石矿脉");
        provider.add("gtceu.jei.ore_vein.nickel_vein_ad", "镍矿脉");
        provider.add("gtceu.jei.ore_vein.magnetite_vein_ad", "磁铁矿脉");
        provider.add("gtceu.jei.ore_vein.iron_vein_ad", "铁矿脉");
        provider.add("gtceu.jei.ore_vein.beryllium_vein_ad", "铍矿脉");
        provider.add("gtceu.jei.ore_vein.tetrahedrite_vein_ad", "黝铜矿脉");
        provider.add("gtceu.jei.ore_vein.salts_vein_ad", "盐矿脉");
        provider.add("gtceu.jei.ore_vein.naquadah_vein_ad_mars", "硅岩矿脉");
        provider.add("gtceu.jei.ore_vein.chromium_vein_ad", "铬矿脉");
        provider.add("gtceu.jei.ore_vein.uranium238_vein_ad", "铀238矿脉");
        provider.add("gtceu.jei.ore_vein.magnesite_vein_ad", "菱镁矿脉");
        provider.add("gtceu.jei.ore_vein.platinum_vein_ad", "铂矿脉");
        provider.add("gtceu.jei.ore_vein.lapis_vein_ad", "青金石矿脉");
        provider.add("gtceu.jei.ore_vein.olivine_vein_ad", "橄榄石矿脉");
        provider.add("gtceu.jei.ore_vein.manganese_vein_ad", "锰矿脉");
        provider.add("gtceu.jei.ore_vein.lubricant_vein_ad", "皂石矿脉");
        provider.add("gtceu.jei.ore_vein.saltpeter_vein_ad", "蓝石矿脉");
        provider.add("gtceu.jei.ore_vein.calorite_vein_ad", "耐热合金矿脉");
        provider.add("gtceu.jei.ore_vein.rutile_vein_ad", "金红石矿脉");
        provider.add("gtceu.jei.ore_vein.iridium_vein_ad", "铱矿脉");
        provider.add("gtceu.jei.ore_vein.pyrolusite_vein_ad", "软锰矿脉");
        provider.add("gtceu.jei.ore_vein.naquadah_vein_ad", "硅岩矿脉");
        provider.add("gtceu.jei.ore_vein.osmium_vein_ad", "锇矿脉");
        provider.add("gtceu.jei.ore_vein.neutronium_vein_ad", "中子素矿脉");
        provider.add("gtceu.jei.ore_vein.niobium_vein_ad", "铌矿脉");
    }

    private static String getMaterialName(Material material) {
        return "material.gtceu." + material.getName();
    }
}
