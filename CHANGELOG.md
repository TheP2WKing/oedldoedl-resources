# Changelog

## [4.2.0] - 2024-11-27

### Added

- added bacon agaric from satisfactory (also generating in world)
- added caterium block, ore, ingot, nugget and dust from satisfactory
- added cookie ore
- added jer support

### Changed

- updated creative tab implementation
- reworded ore world gen configs to distinguish between other generator features
- reworked word gen implementation
- increased default weighs of nether ores generating
- uranium powder ore is now limited to drop only one uranium powder

### Fixed

- fixed some nether ores not even generating 
- fixed some nether ore not dropping anything
- fixed oedldoedl nugget not having enchanted effect
- fixed missing hight level tooltips

### Removed

- removed chaos ingot and catalyst enchanted effect

## [4.1.0] - 2024-06-09

### Added

- added JEI integration for randomite drops
- added config options for various ore drop chances
- added star storage blocks
- added back previously removed sulfur and niter ore as wells their dusts

### Changed

- shapeless recipes are now truly shapeless and use oredict
- fixed uranium powder dropping logic
- fixed all items that rely on right click function to properly show hand animations
- Kitagawarium is now using dolphin grace potion effect instead of water breathing
- Cloudium now gives slow falling effect instead of glowing
- all gems are now possible as beacon payment

### Removed

- removed some remnants from blocks and items that were present in 1.16+ versions

## [4.0.0] - 2024-03-03

### 1.12.2 isn't dead, it just took some time

Also check out the other mods that have been updated or released! This is a complete rewrite of the old 2.x version and many things have changed since then. The most significant change is that almost everything that was seen in v3.x for 1.16.5 is more or less included in the release, with lots of extras on top.

### Warning

This version is not compatible with older versions and will not work. Back up your world before the update and enjoy the wave of content.

### Added

- added changelog
- added various mission storage to oedldoedl metals and materials
- added missing oredict entries
- added top tooltips to blocks that give effects
- added config options to rebalance effect duration and strength
- added even more balanced clay
- added money, cloudium, elevatium, nagatorium, sakurajimarium and kitagawarium metals
- added more stars
- added uranium powder and ore that explodes
- added gunpowder and cookie ore
- added randomite ore and oredict entry for easily adding more drops
- added nuggets and shards for vanilla materials
- added storage block for nether stars
- added ender ore particles
- added chaos plank sound effect
- added tooltips for item that are dropped by ores

### Changed

- changed license to MIT
- changed jar naming scheme
- updated shields.io badges
- updated curseforge and github page
- updated logo
- updated dependencies
- storage blocks of ingots now give the corresponding potion effect
- updated all textures to fit the programmer art look
- reworked nether and end drops
- reworked word gen of ores and rebalanced generation
- adjusted rarity colors
- changed harvest levels to be more like vanilla
- changed nearly all recipes

### Removed

- removed avaritia dependency and halo item rendering
- removed element blocks
- removed saltpeter and sulfur dusts and ores
- removed infinity stars and storage blocks
- removed overworld, nether and end ingot
- removed jei descriptions for ores
- removed now deprecated config options
