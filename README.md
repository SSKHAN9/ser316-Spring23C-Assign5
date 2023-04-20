# SER316 Farm Simulator

Activity 1:
## Design Patterns:

the Factory pattern to manage the animals on the farm since they will have similar functions such as health and harvest (pigs for truffles or bacon, cows for milk, chickens for eggs). 

The Decorator pattern would be useful for implementing new abilities for the farmer when upgrades are made, such as a cheese-making ability added to the farm after upgrading the barn to accommodate cows. Lastly, 

the Builder pattern can facilitate the process of adding new upgrades to the farm as they become available.

Activity 2:

DESIGN PATTERNS USED: DECORATOR, STATE, FACTORY.


DP Explanations:

Factory:

The requirements were met by the factory design pattern which provided a way to generate objects used in the simulation.
The first requirement, which involves the chance for animals to be born, required a factory to create animals once they could be born. This applies to all objects that play a role in the flow of the simulation.
For the second requirement, a factory was used to create animals for the life cycle of each animal.
The third requirement involved the need for a factory to easily create all the characters, including animals, crops, farmers, predators, and farms, which made buying and selling crops easy.
Decorator:

The requirements were met using the decorator design pattern which made upgrading farms, farmers, and animals easy.
The first requirement was met using the decorator pattern to automatically upgrade farms to level 2 when a player reaches level 2 and has $1000.
For the second requirement, the decorator pattern was used to upgrade farmers to level 2 and enable them to purchase a level 2 farm when they have $1000.
The third requirement involved increasing the value of an animal product by $120 when the animal is upgraded to level 2, which was done using the decorator pattern.
State:

The requirements were met using the state design pattern which provided a way to manage the state of animals and crops.
The first requirement was met by using the state pattern to signal when an animal had a product ready to be sold, as seen in ageAnimals().
For the second requirement, the state pattern was used to indicate whether an animal is alive or dead, which changes when a predator attack occurs, as seen in main().
The third requirement was met by using the state pattern to indicate whether a crop is diseased or not and whether it will wither and die, as seen in main().


All Reqs met:
	• A new world must start with at least 1 farm.

	• Farms can be of different types, such as an animal farm, a crop farm, a 		  hybrid farm and so on. You can choose to make something up too.

	• The simulation should run on cycles. A cycle is considered to be of 2 parts - 1 day time and 1 night time.

	• Passive currency is earned with each new day (not night). This passive currency income is generated from selling crops or animal products, or both depending on your farm.

	• More currency can be made from farmer, animal or crop affinities (examples below).

	• Farms are automatically upgraded once the farm has acquired enough currency. This could mean that the farm is expanded to grant it more land, which allows it to hold a greater numbers of farmers, animals and crops. The upgrade may also increase the passive currency income. In order for the simulation to not run into issues, it might be a nice idea to make sure the farm only upgrades once your farm has acquired 20% (choose any % you like though) more than the cost of an upgrade. So, if an upgrade costs $1000, it will automatically upgrade at $1200 so the farm still has $200.


	• Farmers can have affinities for things such as (these are some examples to give you ideas):
		– Being better at growing crops

	• Animals reside on farms; it is up to you to decide the total number of animals that your farm(s) will hold. Think of typical farm animals such a cows and pigs, but you can be creative if you wish.

	• Animal product (milk, wool, and so on) is replenished after every 2nd day. For example, if a sheep is sheared for its wool then the farmers must wait 2 cycles (day and night) to collect the wool again.

	• Similar to farmers, animals have affinities too (these are some examples to give you ideas):
		 – A cow may be larger than usual and produce more milk

	• During night cycles predators come out.

	• Animals have a chance to be born every 4 cycles (must have at least 2 for the chance to occur). Alternatively, as an example, you could specify in your simulation that you wish to spend a certain percentage of your total currency every X number of cycles to buy more animals.

	• Animals live for 14 days unless killed by a predator or they become diseased. If killed by a predator they disappear in that same night, if they become diseased they have a chance to die in the next cycle (day and night), unless treated by a farmer. Animal affinities may help with fighting the disease.

	• Animals have a natural life cycle just like in real life. They start as a baby where they cannot produce anything for the first 3 days (but may still be killed by predators and disease), and then after that they may produce until they die.

	• Crops are grown on farms and have a chance to become diseased. When this happens they have a chance to wither and die within the next cycle (day and night), unless treated by a farmer. Crop affinities may help with fighting the disease.


	• Crops may be harvested 1 time every 3 cycles.

	• The farmers on your farm are quite tech savvy, so when animals or crops die (or harvested), an automatic message is sent to their supplier notifying them that they need more stock.


	• Animals and crops cost currency to purchase. If your farm purchases animals or crops in bulk then they may be bought at a discount depending on the quantity.














