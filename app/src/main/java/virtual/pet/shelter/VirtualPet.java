package virtual.pet.shelter;

public class VirtualPet{

    public String name;
    public String description;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int energyLevel;
    private boolean isCooperative;

    public VirtualPet(String name) {
        this.name = name;
        this.hungerLevel = (int)(Math.random()*100);
        this.thirstLevel=(int)(Math.random()*100);
        this.boredomLevel=(int)(Math.random()*100);
        this.energyLevel=(int)(Math.random()*100);
        this.isCooperative=true;
    }

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.hungerLevel = (int)(Math.random()*100);
        this.thirstLevel=(int)(Math.random()*100);
        this.boredomLevel=(int)(Math.random()*100);
        this.energyLevel=(int)(Math.random()*100);
        this.isCooperative=true;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
    public int getThirstLevel() {
        return thirstLevel;
    }
    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }
    public int getBoredomLevel() {
        return boredomLevel;
    }
    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    
    public void feedPet(){
        if (isCooperative){
            this.hungerLevel = interactPointsAdd(this.hungerLevel, 50);
            System.out.println();
            System.out.println("Num, Num, Num..."+this.name+" is eating.");
            drawPictures("hunger");
            System.out.println(this.name+" has finished their bone. "+this.name+"'s Hunger level has been reduced to: "+this.hungerLevel);
            System.out.println();
        }
    }

    public void givePetWater(){
        if (isCooperative){
            this.thirstLevel = interactPointsAdd(this.thirstLevel, 50);
            System.out.println();
            System.out.println("SLUR, SLUR, SLURRRRP..."+this.name+" is drinking the water.");
            drawPictures("thirst");
            System.out.println(this.name+" has finished their water bowl. "+this.name+"'s Thirst level has been reduced to: "+this.thirstLevel);
            System.out.println();
        }
    }

    public void playWithPet(){
        if (isCooperative){
            this.boredomLevel = interactPointsAdd(this.boredomLevel, 50);
            System.out.println();
            System.out.println("Whoosh, whoosh, whoosh... "+this.name+" loves playing fetch!");
            drawPictures("boredom");
            System.out.println(this.name+"'s Boredom level has been reduced to: "+this.boredomLevel);
            System.out.println();
        }
    }

    public void napTime(){
        if (isCooperative){
            this.energyLevel = interactPointsAdd(this.energyLevel, -50);
            System.out.println();
            System.out.println("ZZZ-Zzzz-ZZzzz-hngGGggh-Ppbhww- zZZzzzZZ . . . Be really quite! " + this.name+" is sleeping! ");
            drawPictures("energy");
            System.out.println(this.name+" is up from their nap! "+this.name+"'s Energy level has replenished to: "+this.energyLevel);
            System.out.println();
        }
    }

    public void tick(){
        this.hungerLevel = interactPointsAdd(this.hungerLevel, -15); 
        this.thirstLevel = interactPointsAdd(this.thirstLevel, -15);;
        this.boredomLevel = interactPointsAdd(this.boredomLevel, -15);;
        this.energyLevel = interactPointsAdd(this.energyLevel, 15);;
    }

    public void displayPetStatus(){
        System.out.println();
        System.out.println("Here are the current stats for "+this.name+":");
        System.out.println("Hunger Level: "+this.hungerLevel);
        System.out.println("Thirst Level: "+this.thirstLevel);
        System.out.println("Boredom Level: "+this.boredomLevel);
        System.out.println("Energy Level (the higher the better!): "+this.energyLevel);
        System.out.println();
    }

    private int interactPointsAdd(int state, int points){
        state -= points;
        if (state <0){
                state = 0;
        }
        if (state > 100){
            state = 100;
        }
        return state;
    }

    private void drawPictures(String state){
        switch (state) {
            case "hunger":
                System.out.println("	       ,                /  |`\".	");
                System.out.println("	      /(   ,-~~~-.     /   /  o\\	");
                System.out.println("	     {  \\,`       `~~--\\ _/     `b	");
                System.out.println("	      \\          ;      `  \\   ,_/ _      _	");
                System.out.println("	       `\\      , /    /    \\`\"\"\"` (_\\____/_)	");
                System.out.println("	         \\      `~)---\\     `~~~~)(_/~~~~\\_)	");
                System.out.println("	          `~~~~~~`     `~~~~~~~~`	");
                break;
            case "thirst":
                System.out.println("	                ______    ____	");
                System.out.println("	               :  ;;;;\\__/:  ;\\	");
                System.out.println("	                \\;__/.... :  _/;	");
                System.out.println("	               ___:__ ..__\\_/__;	");
                System.out.println("	               |  ## `--'   ##|;	");
                System.out.println("	               |_____/~;\\_____|;	");
                System.out.println("	                 /~~~_ _ ~~   /	");
                System.out.println("	                 // (_:_)   \\\\	");
                System.out.println("	           _     // ,'~ `,_\\\\~\\_	");
                System.out.println("	          //     ~~`,---,'~~~   \\	");
                System.out.println("	 ___     //         ~~~~      ;; \\_  __	");
                System.out.println("	/_\\/____::_        ,(:;:  __    ;; \\/;;\\  __	");
                System.out.println("	\\_/) _  :: (       ; ;;:    \\    / ;:;;::-,-'	");
                System.out.println("	   |[-]_::-|       : :;;:   /  * | ;:;;:;'	");
                System.out.println("	   | :__:: |       :.`,:::  : +  : /___:'	");
                System.out.println("	   |[_ ] [\\|       ;. ;--`:_:.  *| /   /	");
                System.out.println("	   |__| |_]|    ,-' . :uu-'/     \\|UUU/	");
                System.out.println("	   |_______|   ;_|_|_/    :_;_;_;_:	");
                System.out.println("	    [=====]	");
                break;
            case "boredom":
                System.out.println(	"	                                                    /)	"	)	;
                System.out.println(	"	                                              o__^^/_/)	"	)	;
                System.out.println(	"	                                               \\ ' \\`-'     ___	"	)	;
                System.out.println(	"	                                                `|  \\______/--'`	"	)	;
                System.out.println(	"	                                                 |         \\	"	)	;
                System.out.println(	"	                                               ././-------,.\\ 	"	)	;
                System.out.println(	"	                                   _	"	)	;
                System.out.println(	"	                                (\\ \\)	"	)	;
                System.out.println(	"	                              o__^\\/     ,	"	)	;
                System.out.println(	"	                               \\ ' \\    <   _  _	"	)	;
                System.out.println(	"	 '  .                          `|  \\____\\   -   -	"	)	;
                System.out.println(	"	       '      . .      ()        |        )  _   _	"	)	;
                System.out.println(	"	         `.'       `.'         .//---_/-_/ _  _	"	)	;
                System.out.println(	"		"	)	;
                System.out.println(	"	                        (\\	"	)	;
                System.out.println(	"	                       (\\_\\^^__o   .	"	)	;
                System.out.println(	"	                       `-'\\ ` /   `(	"	)	;
                System.out.println(	"	                          |  \\_____|	"	)	;
                System.out.println(	"	                          |        |                _	"	)	;
                System.out.println(	"	                        ./`,----./~|     .   .   . - ()	"	)	;
                System.out.println(	"		"	)	;
                System.out.println(	"	                                                        (\\	"	)	;
                System.out.println(	"	                                                       (\\_\\_^__o	"	)	;
                System.out.println(	"	                                                ___     `-'/ `_/	"	)	;
                System.out.println(	"	                                               '`--\\______/  |	"	)	;
                System.out.println(	"	                                          '        /         |	"	)	;
                System.out.println(	"	                                      `    .  '  -`/.------'\\^-'	"	)	;
                break;
            case "energy":
                System.out.println("	(                   )            \\ \\	");
                System.out.println("	 \\                 /              \\ \\	");
                System.out.println("	  \\ _ _ _ _ _ _ _ /             ___) )	");
                System.out.println("	           (__)_     ____      /     \\	");
                System.out.println("	              (_)o  /   | \\--._)     /	");
                System.out.println("	                  __|uu | |   \\   \\_ \\	");
                System.out.println("	                 /      | | __ \\  /_) \\	");
                System.out.println("	                (_)_____|_|(____)(_____)	");
                break;

                default:
                break;
        }
    }
}
