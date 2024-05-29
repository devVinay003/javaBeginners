class dog{
int height, weight;
String breed , colour ;
}
class xyz {
    public static void main(String[] args) {
        dog beagle = new dog ();
        dog labaradore = new dog ();
        beagle.height = 16 ;
        beagle.colour = "white & brown" ;
        labaradore.height = 17;
        labaradore.colour="black";
        System.out.println("beagle height is "+ beagle.height);
        System.out.println("beagle color is "+beagle.colour );
    }

}
