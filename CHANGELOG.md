### Version 1.3.6 (2015-05-06)
- 无抽屉模式下，托盘的图标与桌面图标使用相同的大小
- 无抽屉模式下，托盘图标的左右间距与桌面图标左右间距相同
- hotseat icon size is the same as desktop icon's in no drawer mode
- hotseat's left and right padding is the same as desktop's in no drawer mode

### Version 1.3.5 (2015-05-05)
- 修正检查授权错误的问题

### Version 1.3.4 (2015-05-05)
- 对于无法获取IMEI的设备，支持使用WiFi的MAC地址作为备用激活选项
- 修复应用抽屉冻结解冻产生重复图标的bug
- 修复应用抽屉无法卸载冻结应用的bug
- 修复应用抽屉没有静默卸载的bug
- 修复部分设置没有立即生效的bug
- fixed several bugs in drawer mode (duplicate icons, unistall apps)
- fixed some setttings don't take effect immediately bug

### Version 1.3.3 (2015-05-03)
- 修复小部件页面为空白的bug
- fixed empty widgets page bug

### Version 1.3.2 (2015-05-03)
- 优化桌面加载速度
- 在无抽屉和有抽屉模式下，允许在一个文件夹中放置相当于4页主屏图标数量的图标
- optimize desktop load speed
- in nondrawer and drawer mode, allow as much as 4 homescreen icons to be placed in a folder

### Version 1.3.1 (2015-05-02)
- 优化冻结应用速度
- 抽屉模式下同时隐藏抽屉中的应用
- optimize freeze speed
- hiding apps in drawer at the same time (drawer mode)

### Version 1.3 (2015-05-02)
- 新增隐藏应用功能
- 新增“显示冻结的系统应用”选项
- 同步最新 Trebuchet 代码
- add hide apps feature
- add "show frozen system apps" option
- sync with latest Trebuchet code

### Version 1.2.8 (2015-04-30)
- 修正了重启后解冻系统应用产生重复图标的问题
- fixed duplicate icon issue when defrosting system app after restart

### Version 1.2.7 (2015-04-28)
- 无抽屉模式下，如果一个图标无法启动，现在可以删除它
- if an icon can't launch in none drawer mode, you can remove it
- fixes play license checking issue

### Version 1.2.6 (2015-04-26)
- 为了避免困惑，不会在桌面添加冻结的系统应用
- 设置页面分组
- won't add frozen system apps on desktop
- grouping settings page

### Version 1.2.5 (2015-04-25)
- 修复文件夹图标padding
- 可能修复了偶尔出现的冻结图标不变灰问题
- 初始化桌面时，正常应用和冻结应用会按安装时间排序
- 额，今天是我的生日
- fix folder icon padding
- may fix sometimes icon not greyed when freezing
- sort apps (both normal and frozen) by install time when initiating desktop
- oh, it's my birthday today

### Version 1.2.4 (2015-04-23)
- 大量代码优化和修复

### Version 1.2.3 (2015-04-22)
- 修复了文件夹中冻结应用的严重bug

### Version 1.2.2 (2015-04-22)
- 如果图标包不包含某个应用的图标，将以原图标显示
- 新增启动器入口，现在冷桌面可以从别的桌面打开了
- 新增更新日志入口（在设置页面）
- 新增FAQ入口（在设置页面）
- 修复解冻某些无图标应用的情况
- 对冻结解冻的内在逻辑进行修复和优化，减少异常状况的发生

### Version 1.2.1 (2015-04-21)
- 一定程度上修复Lucky Patcher可以破解的问题
- 修复Play的验证在手机飞行模式或者无信号下失效的问题
- 修正了一些可能会导致重复图标的bug
- 新增检查更新入口（在设置页面）

### Version 1.2 (2015-04-19)
- 如果文件夹中的应用全部冻结，那么拖动可以解冻
- 修复从小部件页返回桌面的bug

### Version 1.2beta 8 (2015-04-18)
- 修复了重复图标的问题
- 修复了冻结解冻包含多个启动项的应用的冻结解冻

### Version 1.2beta 7 (2015-04-17)
- 支持市场验证和序列号验证

### Version 1.2beta 6 (2015-04-09)
- 修复了使用图标包时可能缺失图标的bug
- 混淆代码，减小体积

### Version 1.2beta 5 (2015-04-09)
- 仅当点击应用时才会“解冻并启动”应用
- 修复了一个可能导致重复图标的bug

### Version 1.2beta 4 (2015-04-08)
- 紧急修复一个IconCache.remove的bug

### Version 1.2beta 3 (2015-04-08)
- Play市场发布

### Version 1.2beta 2 (2015-04-08)
- 新功能：静默卸载
- 新功能：当返回桌面时，冻结上次“解冻并启动”的应用
- 修正添加widget后返回桌面的bug
- 修正通过Play商店安装应用多添加一个快捷方式的bug

### Version 1.2beta 1 (2015-04-05)
- 本次更新基于Trebuchet重新开发，所以需要先卸载旧版或者清空数据！
- 包含了最新Trebuchet的大部分特性，如自定义网格，滚动特效等
- 支持图标包！（兼容APEX/NOVA/ADW/GO图标包）
- 提供开启和关闭抽屉模式的选项

- 目前暂时兼容4.2以上版本，4.1版本的兼容作为后续工作

### Version 1.1beta (2015-03-24)
- 桌面抽屉选项，喜欢抽屉的可以从设置中开启
- 冻结一个文件夹中的所有应用
- 解冻应用后自动启动应用
- 冻结系统应用
- 图标大小选项
- 去除某些应用名前面的多余空格（如“美团”）
- 注：新功能在桌面设置的“高级特性”中提供设置

### Version 1.0.1 (2015-03-21)
- 修正了文件夹的bug (把能想到的N种情况测了一下午，总算没bug了！)
- 修正了几个友盟收集的错误
- 通过其他应用冻结系统应用后，不会在桌面追加该应用灰色的图标 (不允许在桌面冻结系统应用是因为冻结系统应用有风险，小白用户或者误操作可能会把电话短信这样的应用冻结！并且其实系统应用可以在原生的应用信息页面中点击“停用”来禁用，这也是更原生更安全的方式)
- 关于其他机型的兼容性bug：由于目前我手头只有N4，可以确保原生系统和CM正常运行。别的...待优化

### Version 1.0 (2015-03-18)
- 第一版发布
