package dao;

import models.RegionGen;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

/**
 * Created by Guest on 1/26/18.
 */
public class Sql2oRegionGenDao implements RegionGenDao {

    private final Sql2o sql2o;

    public Sql2oRegionGenDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

//    public RegionGen setupRegion = new RegionGen.Builder();
//
//    @Override
//    public void add(RegionGen region){
//        /*needs to:
//            -
//         */
//        String sql = "INSERT INTO regions () VALUES (:)";
//        try(Connection con = sql2o.open()){
//            int id = (int) con.createQuery(sql)
//                    .bind(region)
//                    .executeUpdate()
//                    .getKey();
//            region.setId();
//        }catch (Sql2oException ex) {
//            System.out.println(ex);
//        }
//    }
}
