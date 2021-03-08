# Dragon Rush

<p>
	This repository was made for us to collaborate on our final game project.<br>
	Vanier College, Computer Science Technology, Fall 2020, Game Programming, Tassia Camoes-Araujo.
</p>
 
## Description

<p> 
	Dragon Rush was inspired by classic games such as Ms. Pac-Man, Snake, Sandwich Stacker, Mario & Dino Rush.<br>
	Dragon Rush is made of several levels, each based on the aforementioned games. The goal is to test the player's skill level in each game.
</p>

## Acknowledgments

<p> 
	This game was designed and created by Giuliana Bouzon, Chelsea Nadarajah-Chinniah, Andrei Marinescu & supervised by Tassia Camoes-Araujo.<br>
	Asset Creators: Akylrum, Robert Brooks, MadFireOn, Giuliana Bouzon, Hassekf, Carlos Alface, Scofanogd, Xom Adept, Chelsea Nadarajah-Chinniah, HerraBilbo, 
	ProjectsU012, LittleRobotSoundFactory, Gemmellness, Mike Koenig, Sebastian, Cabled_Mess, Harrietniamh, Yummie, Michael Kolling, Chilka Castro.<br>
	Asset sources: Open Game Art org, Itch.io, Game Developer Studio, GIMP, PNG Tree, Adobe After Effects, Free Sound org, Sound Bible, Michael Kolling Book Scenarios.
</p>

## Version History 

<h1> 
    <b>Version 0.1.0, November 12<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
    Added classes (Fruits, Dragon, World, Enemies parent classes + their respective child classes).<br> 
    Made makeArrays() method in World class to make images arrays for each character.<br>
    Made switchImage() method in World class to provide animation for each animated character (with multiple images in arrays).<br>
    Added images edited and cropped by Chelsea Nadarajah-Chinniah and Giuliana Bouzon to images folder in the Greenfoot project.
</p>

<h1> 
    <b>Version 0.2.1, November 13<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Chelsea Nadarajah-Chinniah:</strong><br>
	Made Fruits move to the left of the world and disappear(a part of the scrolling world). <br>
	Made lining of the world (the ground) move (also a part of the scrolling world).<br>
	Edited and added the borders to the world.<br> 
	Edited walking baby dragon sprites. <br>
	Added user controls to the dragons. <br>
	Did the jump controls for the dragon. <br>
	Fixed the hitbox.<br>
	Fire animation to go left and right in progress.<br>
</p>

<h1> 
    <b>Version 0.3.1, November 19<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Deleted unused classes.<br>
	Simplified methods.<br>
	Deleted images.<br>
	Simplified game.<br>
	New concept: childhood games, Pac-man, Snake game, Mario.<br>
</p>

<h1> 
    <b>Version 0.4.1, November 19<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Chelsea Nadarajah-Chinniah:</strong><br>
	Created new world (added new background and edited pictures of characters and the powerups to fit the background). <br>
	Added the user controls for the dragon and the knight (this includes detection of the collision with the walls of the maze through colour detection). <br>
	Added win/lose conditions for the games. <br>
	Added points for the fruits and coins. <br>
	Added timer for the world (which connects to the win condition). <br>
	Added the collision between the dragon (the main character) and the knight (the enemy) (which connects to the lose condition).<br>
</p>

<h1> 
    <b>Version 1.0.0, November 20<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Created new background for PacMan class as well as MenuScreen class and TransitionScreen class. <br>
	Updated knight's movement in PacMan game as well as collision detection and scoring/timing system.<br>
	Updated class inheritance as well as inherited methods.<br>
	Updated jump() method --to be fixed.<br>
	Added a Block class to be used as Platforms in DinoRush class. <br>
</p>

<h1> 
    <b>Version 1.1.0, November 21<sup>st</sup> of 2020:</b>
</h1>

<p>
	<strong>Andrei Marinescu:</strong><br>
	Created new world (Snake).<br>
	Added new characters and background (new dragon heads and view for background).<br>
	Added the controls for my Dragon (w, a, s, d).<br>
	Added new point system for the dragon while eating the knights.<br>
	Added the lanes where the dragon and knight would spawn and/or walk (so it's a linear type of movement).<br>
</p>

<h1> 
    <b>Version 1.2.0, November 23<sup>rd</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Updated DinoRush game.<br>
	Fixed jump() method for BabyDragon.<br>
	Added methods to add fruits and blocks to the world randomly.<br>
	Updated assets.<br>
	Updated overall game structure.<br>
	Changed game concept for Snake game.<br>
</p>

<h1> 
    <b>Version 1.2.1, November 24<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Refactored Dragon classes and Fruits classes.<br>
	Updated overall game structure. <br>
</p>

<h1> 
    <b>Version 1.2.2, November 26<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Chelsea Nadarajah-Chinniah:</strong><br>
	Edited and added new transiton screens for all 3 levels (and a potential 4th level), menu screen options to be animated into buttons, instructions and credit screen.<br>
	Added menu screen pictures used to make.<br>
	Added more coins and fruits to level 1 of the game.<br>
</p>

<h1> 
    <b>Version 1.3.1, November 29<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Added screens & buttons and their animation.<br>
	Edited assets' hitboxes.<br>
	Fixed jump() on ground and animation method.<br>
	Added dragon animation to level 2 and level 3 as well as fire attack.<br>
	Created skill percentage method (based on total score and player score). <br>
	Updated overall game structure & documentation.<br>

</p>

<h1> 
    <b>Version 1.4.0, December 1<sup>st</sup> of 2020:</b>
</h1>

<p>
	<strong>Andrei Marinescu:</strong><br>
	Added ProperSnake game.<br>
	Edited Fruits.<br>
	Added DBDragon as well as Tail and Bomb.<br>
	Created Timer as well as Score.<br>
	Edited the sequence of the game.<br>
	//Note: I need to put a new Bomb png image. <br>
</p>

<h1> 
    <b>Version 1.4.1, December 3<sup>rd</sup> of 2020:</b>
</h1>

<p>
	<strong>Chelsea Nadarajah-Chinniah:</strong><br>
	Added game over condition.<br>
	Made the knights disappear once they are touched by the dragon.<br>
	When all the knights have been removed from the world, more knights are added.<br>
</p>

<h1> 
    <b>Version 1.5.1, December 4<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Fixed spacing and access modifiers.<br>
	Updated documentations & overall game structure.<br>
	Added wrapping method for level 2 and level 3.<br>
	Implemented Fire class.<br>
	Added enemies to level 3 as well as attack implemented in Fire class.<br>
	Implemented Knight animation and movement.<br>
	Updated GameOver class & TransitionScreen class.<br>
</p>

<h1> 
    <b>Version 1.5.2, December 5<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Andrei Marinescu:</strong><br>
	Deleted ProperDragon map including some necessary classes for that map.<br>
	Created new enemy (Bomb class). <br>
	Added animation to the bomb when "detonated" (audio bug to be fixed).<br>
	Added a game over condition so to restart when score is negative.<br>
	Speed up function when at a certain score.<br>
</p>

<h1> 
    <b>Version 1.5.3, December 5<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Updated documentations & overall game structure.<br>
	Edited sounds (equalizer) & images.<br>
	Just some more refactoring.<br>
</p>

<h1> 
    <b>Version 1.5.4, December 6<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Updated documentations & overall game structure.<br>
	Added sounds & game over screens.<br>
	Just some more refactoring.<br>
</p>

<h1> 
    <b>Version 2.0.0, December 10<sup>th</sup> of 2020:</b>
</h1>

<p>
	<strong>Giuliana Bouzon:</strong><br>
	Cleaned up folders & unnecessary code.<br>
	Updated Fire features, Knight movement & skill percentage.<br>
	Updated scoring, game over conditions & Screens.<br>
	Fixed class inheritance, sound bugs & overlap in level 2.<br>
	Added arrow keys for character movement & Record class.<br>
	Fixed skill percentage bug.<br>
	Fixed overlap in level 3 & adjusted speed for Fruits, Coins & Bombs.<br>
	Updated spacing & game documentations.<br>
</p>

## License
<p> This game is licensed under MIT License Copyright (c) 2020 Giuliana Bouzon, Chelsea Nadarajah-Chinniah, Andrei Marinescu.</p>

## Contributing 

<p>
	Outside contributors are welcome.<br>
	Please open an issue before committing any changes.
</p>
