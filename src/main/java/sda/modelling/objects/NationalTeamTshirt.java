package sda.modelling.objects;

public class NationalTeamTshirt extends TShirt {

    public NationalTeamTshirt( final String logo ) {
        super.logo = logo;
    }

    @Override
    public String displays() {
        return this.logo;

    }
}
