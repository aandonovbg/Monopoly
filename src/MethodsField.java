import java.util.Arrays;

public class MethodsField {
    public static void initializeFieldsNamesAndOwners() {
        String[][] fieldsNamesAndOwners = new String[2][40];
        /*{"GO","Mediterranean Avenue","Community Chest","Baltic Avenue","Income Tax","Reading Railroad","Oriental Avenue","Chance",
        "Vermont Avenue","Connecticut Avenue","Jail","St. Charles Place", "Electric Company","States Avenue","Virginia Avenue",
        "Pennsylvania Railroad","St. James Place","Community Chest","Tennessee Avenue","New York Avenue","Free Parking","Kentucky Avenue",
        "Chance","Indiana Avenue","Illinois Avenue","Short Line Railroad","Atlantic Avenue","Ventnor Avenue","Water Works",
        "Marvin Gardens","Go To Jail","Pacific Avenue","North Carolina Avenue","Community Chest","Pennsylvania Avenue","B&O Railroad",
        "Chance","Park Place","Luxury Tax","Boardwalk"},
        {"GO","","Community Chest","",}*/
        fieldsNamesAndOwners[0][0] ="GO";
        fieldsNamesAndOwners[0][1] ="Mediterranean Avenue";
        fieldsNamesAndOwners[0][2] ="Community Chest";
        fieldsNamesAndOwners[0][3] ="Baltic Avenue";
        fieldsNamesAndOwners[0][4] ="Income Tax";
        fieldsNamesAndOwners[0][5] ="Reading Railroad";
        fieldsNamesAndOwners[0][6] ="Oriental Avenue";
        fieldsNamesAndOwners[0][7] ="Chance";
        fieldsNamesAndOwners[0][8] ="Vermont Avenue";
        fieldsNamesAndOwners[0][9] ="Connecticut Avenue";
        fieldsNamesAndOwners[0][10] ="Jail";
        fieldsNamesAndOwners[0][11] ="St. Charles Place";
        fieldsNamesAndOwners[0][12] ="Electric Company";
        fieldsNamesAndOwners[0][13] ="States Avenue";
        fieldsNamesAndOwners[0][14] ="Virginia Avenue";
        fieldsNamesAndOwners[0][15] ="Pennsylvania Railroad";
        fieldsNamesAndOwners[0][16] ="St. James Place";
        fieldsNamesAndOwners[0][17] ="Community Chest";
        fieldsNamesAndOwners[0][18] ="Tennessee Avenue";
        fieldsNamesAndOwners[0][19] ="New York Avenue";
        fieldsNamesAndOwners[0][20] ="Free Parking";
        fieldsNamesAndOwners[0][21] ="Kentucky Avenue";
        fieldsNamesAndOwners[0][22] ="Chance";
        fieldsNamesAndOwners[0][23] ="Indiana Avenue";
        fieldsNamesAndOwners[0][24] ="Illinois Avenue";
        fieldsNamesAndOwners[0][25] ="Short Line Railroad";
        fieldsNamesAndOwners[0][26] ="Atlantic Avenue";
        fieldsNamesAndOwners[0][27] ="Ventnor Avenue";
        fieldsNamesAndOwners[0][28] ="Water Works";
        fieldsNamesAndOwners[0][29] ="Marvin Gardens";
        fieldsNamesAndOwners[0][30] ="Go To Jail";
        fieldsNamesAndOwners[0][31] ="Pacific Avenue";
        fieldsNamesAndOwners[0][32] ="North Carolina Avenue";
        fieldsNamesAndOwners[0][33] ="Community Chest";
        fieldsNamesAndOwners[0][34] ="Pennsylvania Avenue";
        fieldsNamesAndOwners[0][35] ="B&O Railroad";
        fieldsNamesAndOwners[0][36] ="Chance";
        fieldsNamesAndOwners[0][37] ="Park Place";
        fieldsNamesAndOwners[0][38] ="Luxury Tax";
        fieldsNamesAndOwners[0][39] ="Boardwalk";
        Arrays.fill(fieldsNamesAndOwners[1], "");
        System.out.println(Arrays.deepToString(fieldsNamesAndOwners).replace("[","\n").replace("]","\n"));
    }

    public static void setFieldOwner(String name) {

    }
}
