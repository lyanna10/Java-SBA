// Create a superclass called Car. The Car class has the following fields and methods:
//int speed;
//double regularPrice;
//String color;
//double getSalePrice();
class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

//Create a subclass of the Car class and name it Truck. The Truckclass has the following fields and methods.
//int weight;
//double getSalePrice(); // for this method, implement this: If weight > 2000, 10% discount. Otherwise, 20%discount.
class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; // 10% discount
        } else {
            return regularPrice * 0.8; // 20% discount
        }
    }
}

//Create a subclass of the Car class and name it Ford. The Ford class has the following fields and methods
//int year;
//int manufacturerDiscount;
//double getSalePrice(); // for this method, implement this: from the sale price computed for the Car class, subtract the manufacturer Discount.
class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

//Create a subclass of the Car class and name it Sedan. The Sedan class has the following fields and methods.
//int length;
//double getSalePrice(); // for this method, implement this: If length > 20 feet, 5% discount; otherwise, 10% discount
class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95; // 5% discount
        } else {
            return super.getSalePrice() * 0.9; // 10% discount
        }
    }
}

