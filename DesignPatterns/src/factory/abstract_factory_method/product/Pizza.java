package factory.abstract_factory_method.product;

import java.util.List;

import factory.abstract_factory_method.ingredients.Cheese;
import factory.abstract_factory_method.ingredients.Clams;
import factory.abstract_factory_method.ingredients.Dough;
import factory.abstract_factory_method.ingredients.Sauce;
import factory.abstract_factory_method.ingredients.Veggies;

public abstract class Pizza {
    private String name;

    private Dough dough;
    private Sauce sauce;
    private Clams clam;
    private List<Veggies> veggies;
    private Cheese cheese;

    public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }

    public List<Veggies> getVeggies() {
        return veggies;
    }

    public void setVeggies(List<Veggies> veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(name + " -");
		if (dough != null) {
			result.append(dough);
			result.append("-");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("-");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("-");
		}
		if (veggies != null) {
			result.append(veggies);
			result.append("-");
		}
		if (getClam() != null) {
			result.append(getClam());
		}
		return result.toString();
    }
}
