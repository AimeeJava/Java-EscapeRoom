1. Equipment list (keys and boxes) in the escape room, specifying which key opens which box. Each key and each box have unique identifiers to keep track of the equipment and to help the staff reset the room each time it is used.
2. Setup instructions specify what item is placed into what box. This is a step-by-step checklist that allows the staff to reset the escape room quickly.
3. Search sequence is the sequence in which some of the items are found in the escape room. Other items will be discovered when boxes are opened.

Processing
The main program Escape1 simulates an escape room. The main program:
• Reads in the equipment list and instantiates all the items (keys and boxes
• Reads in the setup instructions and places the specified items into the specified boxes
• Read in the search sequence:
For each found item
o Add it to the table
o Determine if the item can be used with any of the other unused items on the table
§ If the item is a key and there is a box on the table that it can unlock
§ If the item is a box that can be unlocked by a key on the table o If a box is unlocked,
§ Remove the item in the box and add it to the table
§ Mark the two items that were used as used
§ The removed item is considered the next “found” item § If the item is the “Escaped!” prize, stop.

When the equipment list is processed, your program will need to create Room objects to repre- sent the rooms. A Room is an extension of a Container.
When a X found statement is read during the search sequence, your program will need to determine if X is a room or another item.
o If X is not a room, process it as before.
o If X is a room, remove all the items from room X and add them to the table. Each room
will have at least one item.

A box can be locked with multiple keys by calling lockWith() multiple times. The box becomes unlocked when unlockWith() is called with each of the keys that the box was locked with. Not necessarily in the same order.
• A box can hold multiple items, just like a room.
o Boxes can have multiple items added by calling addItem() multipletimes.
o Calling remove Item()removes the next item from the box,in the order that the items were added.
o When a box is opened, all the items are added to the table in the order that they are removed from the box.

![Screenshot 2024-01-21 at 01 23 56](https://github.com/AimeeJava/Java-EscapeRoom/assets/107523986/6bbddf84-fbe3-490a-aaf9-d4a2292b1165)
