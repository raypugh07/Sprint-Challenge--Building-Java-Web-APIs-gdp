package com.gdp.gdp;


import com.gdp.gdp.model.GDP;

import java.util.ArrayList;


public class CountryList {

  public ArrayList<GDP> countryList=new ArrayList<GDP>();

    public CountryList(){



        countryList.add(new GDP("United States","20513000"));
        countryList.add(new GDP("China","13457267"));
        countryList.add(new GDP("Japan","5070626"));
        countryList.add(new GDP("Germany","4029140"));
        countryList.add(new GDP("United Kingdom","2808899"));
        countryList.add(new GDP("France","2794696"));
        countryList.add(new GDP("India","2689992"));
        countryList.add(new GDP("Italy","2086911"));
        countryList.add(new GDP("Brazil","1909386"));
        countryList.add(new GDP("Canada","1733706"));
        countryList.add(new GDP("South Korea","1655608"));
        countryList.add(new GDP("Russia","1576488"));
        countryList.add(new GDP("Spain","1437047"));
        countryList.add(new GDP("Australia","1427767"));
        countryList.add(new GDP("Mexico","1199264"));
        countryList.add(new GDP("Indonesia","1005268"));
        countryList.add(new GDP("Netherlands","909887"));
        countryList.add(new GDP("Saudi Arabia","769878"));
        countryList.add(new GDP("Turkey","713513"));
        countryList.add(new GDP("Switzerland","709118"));
        countryList.add(new GDP("Taiwan","602678"));
        countryList.add(new GDP("Sweden","554659"));
        countryList.add(new GDP("Poland","549478"));
        countryList.add(new GDP("Belgium","536055"));
        countryList.add(new GDP("Thailand","490120"));
        countryList.add(new GDP("Argentina","475429"));
        countryList.add(new GDP("Austria","459401"));
        countryList.add(new GDP("Norway","441439"));
        countryList.add(new GDP("United Arab Emirates","432612"));
        countryList.add(new GDP("Iran","430082"));
        countryList.add(new GDP("Nigeria","397472"));
        countryList.add(new GDP("South Africa","376679"));
        countryList.add(new GDP("Ireland","366448"));
        countryList.add(new GDP("Israel","365599"));
        countryList.add(new GDP("Hong Kong","360315"));
        countryList.add(new GDP("Denmark","354683"));
        countryList.add(new GDP("Malaysia","347290"));
        countryList.add(new GDP("Singapore","346621"));
        countryList.add(new GDP("Colombia","336940"));
        countryList.add(new GDP("Philippines","331678"));
        countryList.add(new GDP("Pakistan","306987"));
        countryList.add(new GDP("Chile","299887"));
        countryList.add(new GDP("Bangladesh","286275"));
        countryList.add(new GDP("Finland","276553"));
        countryList.add(new GDP("Egypt","249471"));
        countryList.add(new GDP("Czech Republic","244540"));
        countryList.add(new GDP("Vietnam","241434"));
        countryList.add(new GDP("Romania","239440"));
        countryList.add(new GDP("Portugal","237962"));
        countryList.add(new GDP("Iraq","230911"));
        countryList.add(new GDP("Peru","228944"));
        countryList.add(new GDP("Greece","218057"));
        countryList.add(new GDP("New Zealand","205997"));
        countryList.add(new GDP("Algeria","188342"));
        countryList.add(new GDP("Qatar","188295"));
        countryList.add(new GDP("Kazakhstan","184209"));
        countryList.add(new GDP("Hungary","156393"));
        countryList.add(new GDP("Kuwait","144523"));
        countryList.add(new GDP("Ukraine","126390"));
        countryList.add(new GDP("Morocco","118178"));
        countryList.add(new GDP("Angola","114504"));
        countryList.add(new GDP("Ecuador","107266"));
        countryList.add(new GDP("Slovakia","106940"));
        countryList.add(new GDP("Puerto Rico","104557"));
        countryList.add(new GDP("Venezuela","96328"));
        countryList.add(new GDP("Sri Lanka","92504"));
        countryList.add(new GDP("Kenya","89591"));
        countryList.add(new GDP("Ethiopia","83836"));
        countryList.add(new GDP("Oman","81682"));
        countryList.add(new GDP("Dominican Republic","81103"));
        countryList.add(new GDP("Guatemala","79109"));
        countryList.add(new GDP("Syria","77460"));
        countryList.add(new GDP("Myanmar","71543"));
        countryList.add(new GDP("Luxembourg","68993"));
        countryList.add(new GDP("Panama","66031"));
        countryList.add(new GDP("Bulgaria","63651"));
        countryList.add(new GDP("Uruguay","60933"));
        countryList.add(new GDP("Costa Rica","60816"));
        countryList.add(new GDP("Croatia","59971"));
        countryList.add(new GDP("Belarus","56934"));
        countryList.add(new GDP("Lebanon","56709"));
        countryList.add(new GDP("Tanzania","55645"));
        countryList.add(new GDP("Slovenia","54969"));
        countryList.add(new GDP("Macau","53961"));
        countryList.add(new GDP("Lithuania","52468"));
        countryList.add(new GDP("Ghana","51815"));
        countryList.add(new GDP("Serbia","47564"));
        countryList.add(new GDP("Cote d'Ivoire","45875"));
        countryList.add(new GDP("Azerbaijan","45592"));
        countryList.add(new GDP("Uzbekistan","43303"));
        countryList.add(new GDP("Libya","43236"));
        countryList.add(new GDP("Democratic Republic of the Congo","42692"));
        countryList.add(new GDP("Turkmenistan","42764"));
        countryList.add(new GDP("Jordan","41869"));
        countryList.add(new GDP("Paraguay","41851"));
        countryList.add(new GDP("Bolivia","41833"));
        countryList.add(new GDP("Tunisia","41662"));
        countryList.add(new GDP("Bahrain","39300"));
        countryList.add(new GDP("Cameroon","38445"));
        countryList.add(new GDP("Latvia","34286"));
        countryList.add(new GDP("Sudan","33249"));
    }

    public GDP findCountry(CheckGDP tester)
    {
        for (GDP d : countryList)
        {
            if (tester.test(d))
            {
                return d;
            }
        }
        return null;
    }

    public ArrayList<GDP> findCountries(CheckGDP tester)
    {
        ArrayList<GDP> tempCountryList = new ArrayList<>();

        for (GDP d : countryList)
        {
            if (tester.test(d))
            {
                tempCountryList.add(d);
            }
        }

        return tempCountryList;
    }


}
