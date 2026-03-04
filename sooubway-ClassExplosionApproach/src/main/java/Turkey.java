public class Turkey extends Sandwich{
    @Override
    public String getDescription() {
        return "Turkey Sandwich";
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
class TurkeyWithRanch extends Sandwich {
    public TurkeyWithRanch() {
        description = "Turkey Sandwich with Ranch";
        price = 23;
    }
}

class TurkeyWithGarlic extends Sandwich {
    public TurkeyWithGarlic() {
        description = "Turkey Sandwich with Garlic";
        price = 22.5;
    }
}

class TurkeyWithMayo extends Sandwich {
    public TurkeyWithMayo() {
        description = "Turkey Sandwich with Mayo";
        price = 22;
    }
}

class TurkeyWithKetchup extends Sandwich {
    public TurkeyWithKetchup() {
        description = "Turkey Sandwich with Ketchup";
        price = 21.5;
    }
}

class TurkeyWithMustard extends Sandwich {
    public TurkeyWithMustard() {
        description = "Turkey Sandwich with Mustard";
        price = 21.75;
    }
}
