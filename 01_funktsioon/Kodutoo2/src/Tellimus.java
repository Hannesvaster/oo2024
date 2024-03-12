public class Tellimus {
    String tellija;
    double tellmiseKogusumma;
    String tellitavEse;

    public Tellimus(String _tellija, double _tellmiseKogusumma, String _tellitavEse) {
        tellija = _tellija;
        tellmiseKogusumma = _tellmiseKogusumma;
        tellitavEse = _tellitavEse;
    }

    public double tellimuseSummaDollarites() {
        return tellimuseKogusumma * 1.07;
    }
    public double tellimuseSummaDollarites(String tellijaUusNimi) {
        tellija = tellijaUusNimi;
    }
}
