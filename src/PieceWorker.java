public class PieceWorker extends Employee{


    private double wage;

    public void setWage(double wage) {
        if ( wage >= 0)
            this.wage = wage;
        else throw new IllegalArgumentException("Wage must be >= 0" );
    }

    public double getWage() {
        return wage;
    }

    private int pieces;

    public void setPieces(int pieces) {
        if ( pieces >= 0)
            this.pieces = pieces;
        else throw new IllegalArgumentException("Pieces must be >= 0" );

    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double Earnings(){
        return wage * pieces;
    }

    public PieceWorker(String name, String lastName, String SSN,double wage, int pieces) {
        super(name, lastName, SSN);
        setWage(wage);
        setPieces(pieces);

    }

    @Override
    public String toString() {

        return super.toString()+"wage=" + wage +
                ", pieces=" + pieces;
    }
}
