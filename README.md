# 物理科技
物理科技是Slimefun4的附加插件,首先添加了來自於SlimeXpansion的完整物品/機器. 這慢慢變成Industrial Craft 2的附加.

> 此為**非官方**版本, 請勿在該作者問題追蹤內回報! <br>
> [原作連結](https://github.com/Slimefun-Addon-Community/LiteXpansion) | [非官方Discord](https://discord.gg/GF4CwjFXT9)

## :world_map: 導航
* [下載](#floppy_disk-下載)
* [內容](#內容)
  * [物品](#card_index_dividers-物品)
  * [機器](#electric_plug-機器)
  * [工具](#hammer_and_wrench-工具)
  * [武器](#crossed_swords-武器)
  * [裝備](#shield-裝備)
  * [UU 物質](#brain-uu-物質)
  * [配置](#gear-配置)
* [Discord](#computer-discord)

## :floppy_disk: 下載
| 非官方繁體中文版 | 官方英文版 |
| -------- | -------- |
| 點下方圖片下載 | 點下方圖片下載 |
| [![Build Status](https://xMikux.github.io/builds/SlimeTraditionalTranslation/LiteXpansion/master/badge.svg)](https://xMikux.github.io/builds/SlimeTraditionalTranslation/LiteXpansion/master) | [![Build Status](https://thebusybiscuit.github.io/builds/J3fftw1/LiteXpansion/master/badge.svg)](https://thebusybiscuit.github.io/builds/J3fftw1/LiteXpansion/master) |

**重要: 如前所述,你必須擁有Slimefun才能使用物理科技. 如果你沒有Slimefun,請到此處:[Slimefun 儲存庫](https://github.com/Slimefun/Slimefun4) [Slimefun 繁體翻譯版](https://github.com/xMikux/Slimefun4). <br>
如果你在下載的時候遇到問題,請查看: [Slimefun Wiki](https://github.com/Slimefun/Slimefun4/wiki/Installing-Slimefun)**

## 內容
### :card_index_dividers: 物品
- 食品合成器 - 持續飽受人造食物;
- 釷鎂合金 - 一個極耐用的合金;
- 釷 - 放射性合金;
- 釷粉 - ; (W.I.P., 還沒有功能)
- 釷粉 - ; (W.I.P., 還沒有功能)
- 廢料 - 用於製作UU-物質;
- UU-物質 - 用於製作其他各種物品;
- 銥 - ; (W.I.P., 還沒有功能)
- 銥板 - ; (W.I.P., 還沒有功能)
- 精煉鐵 - 一種錠來製作其他各種物品; (W.I.P., 還沒有功能)
- 機械外殼 - 用於製作機器; (W.I.P., 還沒有功能)

### :electric_plug: 機器
- 物質回收機 - 此機器會從任何物品製作廢料;
- 物質製作機 - 從廢料轉換成UU-物質, "只需要一點點的電力";

### :hammer_and_wrench: 工具
- 扳手 - 允許你在不手動破壞機器的情況下移除機器; (W.I.P., 還沒有功能)

### :crossed_swords: 武器
- 奈米刀 - 一項先進的技術可以輕鬆切開有機組織;

### :shield: 裝備
- 電磁胸甲 - 吸收所有傷害.;

### :brain: UU 物質
UU-物質是一種難以製造的資源, 可以使用廢料在物質製作機內製造. 你可以使用UU-物質製作很多物品,像是 草地, 玻璃, 銅錠, 等等.

伺服器管理者可以修改,添加或刪除UU-物質的配方.
### :gear: 配置
要添加,刪除或更改 UU物質 配方, 你需要修改 `/plugins/LiteXpansion/uumatter.yml` 檔案.

在 `recipes` 你需要指定輸出, 它可以是[材料](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html) 或 Slimefun 物品ID (附加支持). 如果你想要一個以上的物品數量, 則可以添加一個冒號 (`:`) 合該數量. 然後在列表中指定配方, 空格為無, `x` 為 UU-物質.

這是一個產生20個煤炭例子.
```yaml
recipes:
  # 輸出物品, 冒號 (:) 表示數量
  # 接受材料 (https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html) 或 Slimefun 物品ID
  'COAL:20':
    # 配方, x = UU-物質, 空格 = 無
    - '  x'
    - 'x  '
    - '  x'
```

在 `/plugins/LiteXpansion/config.yml` 檔案下有兩個選項:

- `auto-update` - 通過啟用這個, LiteXpansion 將會自動更新自己到最新版本. (默認: `true`)
- `nerf-other-addons` - 啟用此選項將削弱 InfinityExpansion 的面板 與 Slimefun 的 充能太陽能發電機, 否則 LiteXpansion 中的所有機器將會消耗雙倍能量. (默認: `true`)

### :computer: Discord
如果你需要找Slimefun物品ID, 你可以加入官方Slimefun Discord,點擊底下的徵標來加入伺服器,並在 `#bot-spam` 頻道內輸入 `!item <name/ID>`.
你也可以在`#litexpansion`頻道中討論有關於LiteXpansion. **請使用英文**

<p align="center">
  <a href="https://discord.gg/slimefun">
    <img src="https://discordapp.com/api/guilds/565557184348422174/widget.png?style=banner3" alt="Discord Invite"/>
  </a>
</p>
