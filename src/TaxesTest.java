package taxes;

public class TaxesTest {
//    0 to 14,999 : 0% tax
//15,000 to 19,999.99 : 10% tax
//20,000.00 to 29,999 : 15% tax
//30,000 to 44,999 : 20% tax
//45,000+ : 25% tax

    // Test if it's the correct data type (i.e. reject string)
    // Rejects negative values
    // Rejects no input

    float TestArrayInt[] =      {0, 7000, 17000, 25000, 35000, 50000, 19999, 20001}
    float TestArrayIntExpected[] = {0, 7000, 16800, 23750, 32000, 43750, }
    String TestArrayString[] = {"Forty"}
    float TestArrayNegative[] = {-1}

}