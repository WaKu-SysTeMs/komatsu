/*
 * ブラック会員情報　CRUD処理クラス
 */
package db;

import entity.StayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import util.TryCatchDb;


/**
 *
 * @author s20163037
 */
@Stateless
public class StayListDb extends TryCatchDb {


    public StayListDb() {
        super(StayList.class);
    }


}
