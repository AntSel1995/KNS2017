package travelingsalesman;

import com.google.inject.Inject;
import org.opt4j.core.start.Constant;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Taras on 19.05.2017.
 */
public class SalesmanProblem {
    protected Set<City> cities = new HashSet<City>();
    public class City {
        protected final double x;
        protected final double y;
        public City(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    }
    @Inject
    public SalesmanProblem(@Constant(value = "size") int size) {
        Random random = new Random(0);
        for (int i = 0; i < size; i++) {
            final double x = random.nextDouble() * 100;
            final double y = random.nextDouble() * 100;
            final City city = new City(x, y);
            cities.add(city);
        }
    }
    public Set<City> getCities() {
        return cities;
    }
}

