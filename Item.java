class Item{

        //this class holds information for an item object. It can build an item object, and contains methods
        //to return certain elements of the item.

        private ItemType type;
        private String name;
        private int weight;
        private int value;
        private int strength;
	private boolean pickedUp;

        Item(ItemType type, String name, int weight, int value, int strength){

                //this is a constructor for an item object. it takes all the parameters and sets them equal
                //to the instance variables of the object.
		pickedUp = false;
                this.type = type;
                this.name = name;
                this.weight = weight;
                this.value = value;
                this.strength = strength;
        }

	public int getStrength() {
		return strength;
	}

        public ItemType getType(){

                //this method returns the instance variable type.

                return type;
        }

        public int getWeight(){

                //tbis method returns the instance variable weight.

                return weight;
        }

        public int getValue(){

                //this method returns the instance variable value.

                return value;
        }
	public String getName(){

                //this method returns the instance variable name.

                return name;
        }

        public String toString(){

                //this method returns all of the data that the object contains in an informative format.

                return("Type: "+type+" --- Name: "+name+" --- Weight: "+weight+" --- Value: "+value+" --- Strength: "+strength);
        }
}


