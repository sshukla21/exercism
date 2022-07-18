public class Robot{
    private GridPosition gridPosition;
    private Orientation orientation;
    
    public Robot(GridPosition initialGridPosition, Orientation initialOrientation) {
        this.gridPosition = initialGridPosition;
        this.orientation = initialOrientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }
    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public void turnLeft() {
        if(this.orientation == Orientation.NORTH)
            this.orientation = Orientation.WEST;
        else if(this.orientation == Orientation.WEST)
            this.orientation = Orientation.SOUTH;
        else if(this.orientation == Orientation.EAST)
            this.orientation = Orientation.NORTH;
        else 
            this.orientation = Orientation.EAST;
        
    }
     public void turnRight() {
        if(this.orientation == Orientation.NORTH)
            this.orientation = Orientation.EAST;
        else if(this.orientation == Orientation.WEST)
            this.orientation = Orientation.NORTH;
        else if(this.orientation == Orientation.EAST)
            this.orientation = Orientation.SOUTH;
        else 
            this.orientation = Orientation.WEST;
    }

    public void advance() {
        int X = this.gridPosition.x;
        int Y = this.gridPosition.y;
        if(this.orientation == Orientation.NORTH)
            gridPosition = new GridPosition(X, Y + 1);
        else if(this.orientation == Orientation.WEST)
            gridPosition = new GridPosition(X - 1, Y);
        else if(this.orientation == Orientation.EAST)
            gridPosition = new GridPosition(X + 1, Y);
        else
            gridPosition = new GridPosition(X, Y - 1);

    }
     
    public void simulate(String commands) {
        for(char command: commands.toCharArray()) {
            if(command == 'R')
                this.turnRight();
            else if(command == 'L')
                this.turnLeft();
            else if(command == 'A')
                this.advance();
        }
    }

}
