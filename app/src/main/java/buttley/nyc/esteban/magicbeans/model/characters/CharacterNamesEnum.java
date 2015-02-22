package buttley.nyc.esteban.magicbeans.model.characters;



/**
 * Created by Tara on 1/8/2015.
 */
public enum CharacterNamesEnum {

    BUTTLEY("buttley", CharacterType.BUTTLEY),


//    //Beans//
    AIR_BISCUIT("air_biscuit", CharacterType.BEAN), /* Pilot */
    BABY("baby", CharacterType.BEAN), /* Baby */
    EDEMAMA("edamama", CharacterType.BEAN), /* FANCY LADY */
    BUBBA("bubba", CharacterType.BEAN), /* BIG FAT BEAN */
    DUSTY("dusty", CharacterType.BEAN), /* OLD FART COWBOY */
    HOLY_FRIJOLE("holy_frijole", CharacterType.BEAN), /* PADRE */
    TWERK("twerk", CharacterType.BEAN), /* DANCER */
    BAKED_JAKE("baked_jake", CharacterType.BEAN), /* SURFER */
//    YOGI("yogi", CharacterType.BEAN), /*YOGA MASTER*/
    JOE("joe", CharacterType.BEAN), /* COFFEE BEAN (EXCITED) */
    SHARTY("sharty", CharacterType.BEAN), /*WET FART  -SHOWERCAP */
    SILENT_BUT_DEADLY("silent_but_deadly", CharacterType.BEAN), /* NINJA */
    DUTCH_OVEN("dutch_oven", CharacterType.BEAN), /* CHEF */
//
//    //Patients//
    CRAZY_PIGEON_LADY("crazy_pigeon_lady", CharacterType.PATIENT),
    DISGRUNTLED_OFFICE_WORKER("disgruntled_office_worker", CharacterType.PATIENT),
    UPPER_EAST_SIDE_KVETCHER("upper_east_side_kvetcher", CharacterType.PATIENT),
    DAZED_DAD("dazed_dad", CharacterType.PATIENT),
    YOUNG_URBAN_TRANSPLANT("young_urban_transplant", CharacterType.PATIENT);
//

    private String xmlName;
    private CharacterType characterType;

    private CharacterNamesEnum(String xmlName, CharacterType characterType){
        this.xmlName = xmlName;
        this.characterType = characterType;
    }

    public String getXmlName() {
        return xmlName;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }
}
