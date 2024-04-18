package dev.arbor.gtnn.data.lang

import com.gregtechceu.gtceu.api.data.chemical.material.Material
import dev.arbor.gtnn.data.GTNNMaterials


object MaterialLang {
    fun init() {
        tagPrefix()
        materials()
        jeiOreVeins()
    }

    private fun tagPrefix() {
        tsl("tagprefix.blackstone", "嵌%s黑石", "Blackstone %s Ore")
        tsl("tagprefix.glacio_stone", "坚冰岩%s矿石", "Glacio Stone %s Ore")
        tsl("tagprefix.mars_stone", "深红岩%s矿石", "Mars Stone %s Ore")
        tsl("tagprefix.mercury_stone", "旱海岩%s矿石", "Mercury Stone %s Ore")
        tsl("tagprefix.moon_stone", "月岩%s矿石", "Moon Stone %s Ore")
        tsl("tagprefix.soul_soil", "含%s灵魂土", "Soul Soil %s Ore")
        tsl("tagprefix.venus_stone", "锃金岩%s矿石", "Venus Stone %s Ore")
    }


    fun materials() {
        translateMaterial(GTNNMaterials.AndesiteAlloy, "安山合金")
        translateMaterial(GTNNMaterials.SpaceNeutronium, "中子")
        translateMaterial(GTNNMaterials.Infinity, "无尽")
        translateMaterial(GTNNMaterials.InfinityCatalyst, "无尽催化剂")
        translateMaterial(GTNNMaterials.Desh, "戴斯")
        translateMaterial(GTNNMaterials.Ostrum, "紫金")
        translateMaterial(GTNNMaterials.Calorite, "耐热金属")
        translateMaterial(GTNNMaterials.RP1, "RP-1混合燃料")
        translateMaterial(GTNNMaterials.RP1RocketFuel, "RP-1火箭燃料")
        translateMaterial(GTNNMaterials.Kerosene, "煤油")
        translateMaterial(GTNNMaterials.DenseHydrazineMixedFuel, "浓缩肼混合燃料")
        translateMaterial(GTNNMaterials.Hydrazine, "肼")
        translateMaterial(GTNNMaterials.HydrogenPeroxide, "过氧化氢")
        translateMaterial(GTNNMaterials.EthylAnthraQuinone, "乙基蒽醌")
        translateMaterial(GTNNMaterials.EthylAnthraHydroQuinone, "乙基蒽醌醇")
        translateMaterial(GTNNMaterials.Anthracene, "蒽")
        translateMaterial(GTNNMaterials.MethylhydrazineNitrateRocketFuel, "CN3H7O3火箭燃料")
        translateMaterial(GTNNMaterials.MethylHydrazine, "甲基肼")
        translateMaterial(GTNNMaterials.UDMHRocketFuel, "H8N4C2O4火箭燃料")
        translateMaterial(GTNNMaterials.UDMH, "偏二甲肼")
        translateMaterial(GTNNMaterials.OrangeMetalCatalyst, "橙色金属催化剂")
        translateMaterial(GTNNMaterials.PhthalicAnhydride, "邻苯二甲酸酐")
        translateMaterial(GTNNMaterials.VanadiumPentoxide, "五氧化二钒")
        translateMaterial(GTNNMaterials.BlackMatter, "黑物质")
        translateMaterial(GTNNMaterials.Cerrobase140, "铋铅合金140")
        //translateMaterial(GTNNMaterials.ManaSteel, "魔力钢")
        //translateMaterial(GTNNMaterials.TerraSteel, "泰拉钢")
        //translateMaterial(GTNNMaterials.Elementium, "源质钢")
        translateMaterial(GTNNMaterials.ShadowSteel, "暗影钢")
        translateMaterial(GTNNMaterials.RefinedRadiance, "光辉石")
        translateMaterial(GTNNMaterials.PlatinumSalt, "铂盐")
        translateMaterial(GTNNMaterials.PlatinumSlag, "铂渣")
        translateMaterial(GTNNMaterials.RefinedPlatinumSalt, "精炼铂盐")
        translateMaterial(GTNNMaterials.PalladiumSalt, "钯盐")
        translateMaterial(GTNNMaterials.RhodiumFilterCake, "铑滤饼")
        translateMaterial(GTNNMaterials.RhodiumNitrate, "硝酸铑")
        translateMaterial(GTNNMaterials.RoughlyRhodiumMetal, "粗制铑金属")
        translateMaterial(GTNNMaterials.PalladiumMetal, "钯金属")
        translateMaterial(GTNNMaterials.SodiumRutheniate, "钌酸钠")
        translateMaterial(GTNNMaterials.IridiumDioxide, "二氧化铱")
        translateMaterial(GTNNMaterials.MetalSludge, "金属泥渣")
        translateMaterial(GTNNMaterials.ConcentratedPlatinum, "浓缩铂")
        translateMaterial(GTNNMaterials.RhodiumSulfateGas, "硫酸铑")
        translateMaterial(GTNNMaterials.PalladiumRichAmmonia, "富钯氨")
        translateMaterial(GTNNMaterials.RhodiumSalt, "铑盐")
        translateMaterial(GTNNMaterials.RutheniumTetroxideHot, "热四氧化钌")
        translateMaterial(GTNNMaterials.RutheniumTetroxideLQ, "四氧化钌")
        translateMaterial(GTNNMaterials.ReprecipitatedRhodium, "再沉淀铑")
        translateMaterial(GTNNMaterials.AcidicIridium, "酸性铱")
        translateMaterial(GTNNMaterials.PlatinumMetal, "铂金属")
        translateMaterial(GTNNMaterials.PotassiumPyrosulfate, "焦硫酸钾")
        translateMaterial(GTNNMaterials.SodiumFormate, "甲酸钠")
        translateMaterial(GTNNMaterials.FormicAcid, "甲酸")
        translateMaterial(GTNNMaterials.SodiumSulfate, "硫酸钠")
        translateMaterial(GTNNMaterials.SodiumNitrate, "硝酸钠")
        translateMaterial(GTNNMaterials.ZincSulfate, "硫酸锌")
        translateMaterial(GTNNMaterials.Kaolinite, "高岭石")
        translateMaterial(GTNNMaterials.Dolomite, "白云石")
        translateMaterial(GTNNMaterials.Wollastonite, "硅灰石")
        translateMaterial(GTNNMaterials.ArcaneCrystal, "神秘水晶")
        translateMaterial(GTNNMaterials.NaquadahOxideMixture, "氧化硅岩混合物")
        translateMaterial(GTNNMaterials.EnrichedNaquadahOxideMixture, "氧化富集硅岩混合物")
        translateMaterial(GTNNMaterials.NaquadriaOxideMixture, "氧化超能硅岩混合物")
        translateMaterial(GTNNMaterials.HexafluorideEnrichedNaquadahSolution, "六氟化富集硅岩溶液")
        translateMaterial(GTNNMaterials.XenonHexafluoroEnrichedNaquadate, "六氟氙酸富集硅岩")
        translateMaterial(GTNNMaterials.PalladiumOnCarbon, "钯碳催化剂")
        translateMaterial(GTNNMaterials.GoldTrifluoride, "三氟化金")
        translateMaterial(GTNNMaterials.EnrichedNaquadahResidueSolution, "富集硅岩残余物溶液")
        translateMaterial(GTNNMaterials.XenoauricFluoroantimonicAcid, "氟锑酸二氙")
        translateMaterial(GTNNMaterials.GoldChloride, "氯化金")
        translateMaterial(GTNNMaterials.BromineTrifluoride, "三氟化溴")
        translateMaterial(GTNNMaterials.HexafluorideNaquadriaSolution, "六氟化超能硅岩溶液")
        translateMaterial(GTNNMaterials.RadonDifluoride, "二氟化氡")
        translateMaterial(GTNNMaterials.RadonNaquadriaOctafluoride, "八氟超能硅岩酸氡")
        translateMaterial(GTNNMaterials.NaquadriaResidueSolution, "超能硅岩残余物溶液")
        translateMaterial(GTNNMaterials.CaesiumFluoride, "氟化铯")
        translateMaterial(GTNNMaterials.XenonTrioxide, "三氧化氙")
        translateMaterial(GTNNMaterials.CaesiumXenontrioxideFluoride, "二氟三氧氙酸铯")
        translateMaterial(GTNNMaterials.NaquadriaCaesiumXenonnonfluoride, "九氟氙酸超能硅岩铯")
        translateMaterial(GTNNMaterials.RadonTrioxide, "三氧化氡")
        translateMaterial(GTNNMaterials.NaquadriaCaesiumfluoride, "二氟超能硅岩酸铯")
        translateMaterial(GTNNMaterials.NitrosoniumOctafluoroxenate, "八氟氙酸亚硝酰")
        translateMaterial(GTNNMaterials.NitrylFluoride, "硝酰氟")
        translateMaterial(GTNNMaterials.AcidicNaquadriaCaesiumfluoride, "硫酸二氟超能硅岩酸铯")
        translateMaterial(GTNNMaterials.GraphiteUraniumMixture, "石墨-铀混合物")
        translateMaterial(GTNNMaterials.PlutoniumOxideUraniumMixture, "氧化钚-铀混合物")
        translateMaterial(GTNNMaterials.UraniumCarbideThoriumMixture, "碳化铀-钍混合物")
        translateMaterial(GTNNMaterials.ThoriumBasedLiquidFuel, "钍基流体燃料")
        translateMaterial(GTNNMaterials.ThoriumBasedLiquidFuelExcited, "钍基流体燃料(激发态)")
        translateMaterial(GTNNMaterials.ThoriumBasedLiquidFuelDepleted, "钍基流体燃料(枯竭态)")
        translateMaterial(GTNNMaterials.UraniumBasedLiquidFuel, "铀基流体燃料")
        translateMaterial(GTNNMaterials.UraniumBasedLiquidFuelExcited, "铀基流体燃料(激发态)")
        translateMaterial(GTNNMaterials.UraniumBasedLiquidFuelDepleted, "铀基流体燃料(枯竭态)")
        translateMaterial(GTNNMaterials.PlutoniumBasedLiquidFuel, "钚基流体燃料")
        translateMaterial(GTNNMaterials.PlutoniumBasedLiquidFuelExcited, "钚基流体燃料(激发态)")
        translateMaterial(GTNNMaterials.PlutoniumBasedLiquidFuelDepleted, "钚基流体燃料(枯竭态)")
        translateMaterial(GTNNMaterials.RadiationProtection, "防辐射")
        translateMaterial(GTNNMaterials.NaquadahBasedLiquidFuel, "硅岩流体燃料")
        translateMaterial(GTNNMaterials.NaquadahBasedLiquidFuelExcited, "硅岩流体燃料(激发态)")
        translateMaterial(GTNNMaterials.NaquadahBasedLiquidFuelDepleted, "硅岩流体燃料(枯竭态)")
        translateMaterial(GTNNMaterials.Thorium232, "钍-232")
        translateMaterial(GTNNMaterials.IodizedBrine, "含碘盐水")
        translateMaterial(GTNNMaterials.IodineBrineMixture, "浓缩碘盐水混合物")
        translateMaterial(GTNNMaterials.BrominatedBrine, "含溴盐水")
        translateMaterial(GTNNMaterials.IodineSlurry, "碘浆液")
        translateMaterial(GTNNMaterials.AcidicBrominatedBrine, "酸化含溴盐水")
        translateMaterial(GTNNMaterials.BromineSulfateSolution, "硫酸溴溶液")
        translateMaterial(GTNNMaterials.OverheatedBromineSulfateSolution, "过热硫酸溴气")
        translateMaterial(GTNNMaterials.WetBromine, "湿溴气")
        translateMaterial(GTNNMaterials.DebrominatedWater, "脱溴盐水")
        translateMaterial(GTNNMaterials.NeutroniumMixture, "中子素混合物")
    }

    private fun jeiOreVeins() {
        translateOreVein("kaolinite_vein", "高岭石矿脉")
        translateOreVein("wollastonite_vein", "白云石矿脉")
        translateOreVein("galena_vein_tf", "方铅矿脉")
        translateOreVein("sapphire_vein_tf", "蓝宝石矿脉")
        translateOreVein("olivine_vein_tf", "橄榄石矿脉")
        translateOreVein("nickel_vein_tf", "镍矿脉")
        translateOreVein("diamond_vein_tf", "钻石矿脉")
        translateOreVein("lapis_vein_tf", "青金石矿脉")
        translateOreVein("molybdenite_vein_tf", "辉钼矿脉")
        translateOreVein("coal_vein_tf", "煤矿脉")
        translateOreVein("lubricant_vein_tf", "皂石矿脉")
        translateOreVein("gold_vein_tf", "金矿脉")
        translateOreVein("iron_vein_tf", "铁矿脉")
        translateOreVein("apatite_vein_tf", "磷灰石矿脉")
        translateOreVein("salts_vein_tf", "盐矿脉")
        translateOreVein("cassiterite_vein_tf", "锡石矿脉")
        translateOreVein("monazite_vein_n", "独居石矿脉")
        translateOreVein("bauxite_vein", "铝土矿脉")
        translateOreVein("ilmenite_vein", "钛铁矿脉")
        translateOreVein("quartzite_vein", "石英岩矿脉")
        translateOreVein("molybdenum_vein_ad", "钼矿脉")
        translateOreVein("galena_vein_ad", "方铅矿脉")
        translateOreVein("copper_vein_ad", "铜矿脉")
        translateOreVein("cassiterite_vein_ad", "锡石矿脉")
        translateOreVein("desh_vein_ad", "戴斯矿脉")
        translateOreVein("ostrum_vein_ad", "紫金矿脉")
        translateOreVein("arsenic_vein_ad", "砷矿脉")
        translateOreVein("pitchblende_vein_ad", "沥青铀矿脉")
        translateOreVein("tuff_uraninite_vein_ad", "晶质铀矿脉")
        translateOreVein("scheelite_vein_ad", "白钨矿脉")
        translateOreVein("sulfur_vein_ad", "硫矿脉")
        translateOreVein("redstone_vein_ad", "红石矿脉")
        translateOreVein("nickel_vein_ad", "镍矿脉")
        translateOreVein("magnetite_vein_ad", "磁铁矿脉")
        translateOreVein("iron_vein_ad", "铁矿脉")
        translateOreVein("beryllium_vein_ad", "铍矿脉")
        translateOreVein("tetrahedrite_vein_ad", "黝铜矿脉")
        translateOreVein("salts_vein_ad", "盐矿脉")
        translateOreVein("naquadah_vein_ad_mars", "硅岩矿脉")
        translateOreVein("chromium_vein_ad", "铬矿脉")
        translateOreVein("uranium238_vein_ad", "铀238矿脉")
        translateOreVein("magnesite_vein_ad", "菱镁矿脉")
        translateOreVein("platinum_vein_ad", "铂矿脉")
        translateOreVein("lapis_vein_ad", "青金石矿脉")
        translateOreVein("olivine_vein_ad", "橄榄石矿脉")
        translateOreVein("manganese_vein_ad", "锰矿脉")
        translateOreVein("lubricant_vein_ad", "皂石矿脉")
        translateOreVein("saltpeter_vein_ad", "蓝石矿脉")
        translateOreVein("calorite_vein_ad", "耐热合金矿脉")
        translateOreVein("rutile_vein_ad", "金红石矿脉")
        translateOreVein("iridium_vein_ad", "铱矿脉")
        translateOreVein("pyrolusite_vein_ad", "软锰矿脉")
        translateOreVein("naquadah_vein_ad", "硅岩矿脉")
        translateOreVein("osmium_vein_ad", "锇矿脉")
        translateOreVein("neutronium_vein_ad", "中子素矿脉")
        translateOreVein("niobium_vein_ad", "铌矿脉")
    }


    private fun tsl(key: String?, cn: String, en: String) {
        LangHandler.tsl(key, cn, en)
    }

    private fun translateMaterial(material: Material, cn: String) {
        LangHandler.translateMaterial(material, cn)
    }

    private fun translateOreVein(key: String?, cn: String?) {
        LangHandler.translateOreVein(key, cn)
    }
}
