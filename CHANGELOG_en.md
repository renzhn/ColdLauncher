### Version 4.0 (2016-12-07)
- New simple and intuitive UI
- Show running apps on Android N above (root required)

### Version 3.2 (2016-12-05)
- New icon for "show running apps"
- Greatly faster freezing and defrosting
- Removed elevated plugin

### Version 3.1 (2016-12-05)
- Fixed missing icon issue

### Version 3.0 (2016-12-04)
- More smooth scrolling on desktop
- Return to first screen when press home button while in launcher
- Use snow badge as default
- Use large icon as default
- Fix laggy scrolling while enable "show running apps"
- Fix some bugs that causing crash

### Version 2.9 (2016-11-25)
- New: Folder background opacity setting
- New: Backup settings (desktop layout included)
- New: Restore settings
- New: Restart launcher 
- Fix some compatibility issues
- Improved crash reporting
- Removed Google Analytics

### Version 2.8 (2016-10-12)
- Fix license issue

### Version 2.7 (2016-09-23)
- Minor fixes

### Version 2.6 (2016-09-06)
- Bug fixes and improvements

### Version 2.5 (2016-09-04)
- Gestures support

### Version 2.4 (2016-08-25)
- Adapting Android 6.0
- Other fixes and improvements

### Version 2.3 (2016-08-08)
- Animation improvements
- Bug fixes on disabling animation

### Version 2.2 (2016-08-07)
- Reduced lag for "show running apps" function
- Bug fixes and improvements

### Version 2.1 (2016-08-07)
- Long time no see！
- New option: freeze after resume launcher
- New option: freeze after screen off delay
- Bug fixes

### Version 2.0 (2016-03-18)
- new UI & animation
- refactor settings page
- add various options
- fix if "show running apps" enabled, dekstop sometimes laggy bug

### Version 1.7 (2015-12-05)
- announcing Cold Launcher Classic, a native look and feel version of Cold Launcher
- adopting Google Analytics

### Version 1.6 beta3 (2015-11-28)
- fixed icon overlap issue that may happen when Cold Launcher is in background

### Version 1.6 beta2 (2015-10-25)
- improved welcome screen
- add "how to use" in settings
- English FAQ and changelog

### Version 1.6 beta1 (2015-09-27)
- [Advanced Feature] Show running apps: running apps will be indicated (compatible with Android 4.2 ~ 6.0)
- [Advanced Feature] Freeze after screen off: Temporarily defrost apps and freeze them after screen is off (except apps defrost with long click)
- removed languages except English and Chinese, reduced apk's size by 30%
- improved first time loading workspace
- switch to Android Studio and libsuperuser
- other bug fixes and stability improvements

### Version 1.5.4 (2015-09-03)
- Improved user interaction:
	1. To freeze or defrost app: long click icon and release in 1 second with the icon not moved
	2. To uninstall app(show toolbar): long click icon for 1 second and longer with the icon not moved
	3. To move icon: long click icon and moved it (dragging)
- Other bug fixes

### Version 1.5.3 (2015-08-06)
- Fix possible icon overlapping issue while auto arrange icons
- Other bug fixes and improvements

### Version 1.5.2 (2015-06-27)
- Fixed unable to remove invalid icon issue in some cases
- Fixed overlapped icon issue when adding widgets
- Removed app drawer
- Removed some options
- Changing icon pack without restart app
- Other bug fixes

### Version 1.5.1 (2015-06-13)
- Auto organize when dragging icon in no drawer mode
- Support Google cloud sync to backup app data
- Long press icon to freeze/defrost
- Improved support with SD card apps
- Fixed overlapped icons in previous versions
- Adopting apk protection solution
- Other bug fixes, improved stability

### Version 1.5 (2015-06-06)
- Removed freeze/defrost button, new "Hold&Release" method to freeze app

### Version 1.4.8 (2015-06-02)
- fixed empty folder content when in CM12's power save mode
- optimize default hotseat icons when initializing
- prevent other apps adding duplicate shortcut (like Play store)

### Version 1.4.7 (2015-05-31)
- Defrost'n'launch will be as fast as launch normal app if installed as system app

### Version 1.4.6 (2015-05-30)
- Cold launcher will use ultrafast system built-in method to freeze apps if installed as system app, see "Settings" - "Changelog" for installation method.

	To install as system app:
	1. Download apk from "Settings" - "Check Update", you can rename the apk if you want
	2. Backup Cold Launcher data using Titanium Backup
	3. Uninstall Cold Launcher
	4. Copy apk of Cold Launcher (1.4.6 and above) to /system/priv-app/ using Root Explorer (For Andorid 4.2 it's /system/app/)
	5. Reboot
	6. Restore Cold Launcher data using Titanium Backup
	7. Launch Cold Launcher
	8. Note: You must install apk to /system/priv-app/ unless you don't have this folder, because apps in /system/app/ don't have advanced permission, so new freeze method won't work!

### Version 1.4.5 (2015-05-29)
- Fixed issues related to installing shortcuts to desktop

### Version 1.4.4 (2015-05-27)
- Added option to use classic style: frozen icons will be greyed out
- Other fixes

### Version 1.4.3 (2015-05-25)
- New app icon and freeze icon using shape of snow and raindrop, Cold Launcher is colder now

### Version 1.4.2 (2015-05-23)
- New freezing/defrosting UI, there will be a lock in bottom right of frozen app icon
- Fixes bugs related to frozen system apps
- Fixes crashes collected

### Version 1.4.1 (2015-05-17)
- Freeze system apps will hide them if "show frozen system app" not enabled
- Fixed a bug which may cause crash when unistalling apps
- Fixed a bug which causes crash when no browser available

### Version 1.4 (2015-05-16)
- Clean up resources to lower the size of apk by 22%
- Fixed the issue where folder content cann't be scrolled in drawer mode

### Version 1.3.9 (2015-05-13)
- The number of hotseat icons is the same as the columns of desktop icons in no drawer mode
- If icons out of screen bounds when changing grid size of desktop in no drawer mode, they will be appended to last page
- Allow any number of icons in a folder
- Sync with Trebuchet code
- Bug fixes and performance improvements

### Version 1.3.8 (2015-05-12)
- minor bug fixes

### Version 1.3.7 (2015-05-07)
- fixed many potential bugs that could cause crash
- improved freeze/defrost method (fixed stuck on some devices)
- remove "Strip Extra Space in App Name" option (enabled by default)

### Version 1.3.6 (2015-05-06)
- hotseat icon size is the same as desktop icon's in no drawer mode
- hotseat's left and right padding is the same as desktop's left and right padding in no drawer mode

### Version 1.3.5 (2015-05-05)
- fix license check issue

### Version 1.3.4 (2015-05-05)
- fixed several bugs in drawer mode (duplicate icons, unistall apps)
- fixed some setttings don't take effect immediately bug

### Version 1.3.3 (2015-05-03)
- fixed empty widgets page bug

### Version 1.3.2 (2015-05-03)
- optimize desktop load speed
- in nondrawer and drawer mode, allow as much as 4 homescreen icons to be placed in a folder

### Version 1.3.1 (2015-05-02)
- optimize freeze speed
- hiding apps in drawer at the same time (drawer mode)

### Version 1.3 (2015-05-02)
- add hide apps feature
- add "show frozen system apps" option
- sync with latest Trebuchet code

### Version 1.2.8 (2015-04-30)
- fixed duplicate icon issue when defrosting system app after restart

### Version 1.2.7 (2015-04-28)
- if an icon can't launch in none drawer mode, you can remove it
- fixes play license checking issue

### Version 1.2.6 (2015-04-26)
- won't add frozen system apps on desktop
- grouping settings page

### Version 1.2.5 (2015-04-25)
- fix folder icon padding
- may fix sometimes icon not greyed when freezing
- sort apps (both normal and frozen) by install time when initiating desktop
