/**
 * 
 */
package com.ict.ke;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.rules.InvalidRuleSessionException;
import javax.rules.StatelessRuleSession;

import org.jruleengine.Clause;

import com.ict.ke.engine.Evaluate;
import com.ict.ke.engine.Smie;
import com.ict.ke.engine.user.User;

/**
 * @author Quan T. Nguyen <br>
 * Hanoi University of Science and Technology
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName("L� Qu�n");
		user.setYear(2012);
		user.setHeight(165);
		user.setWeight(72);
		user.setActivity(Evaluate.ACTIVITY_MANY);
		
		Smie smie = new Smie();
		StatelessRuleSession session = smie.setupSession("res/rule/calperday.xml");
		
		// TODO Test rules here
		ArrayList<Object> users = new ArrayList<Object>();
		users.add(user);
		List results = null;
		try {
			results = session.executeRules(users);
		} catch (InvalidRuleSessionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Result of calling getObjects: " + results.size() + " results.");
		for (Object clause : results) {
			if (clause instanceof Clause) {
				System.out.println(clause.toString() + " " + ((Clause) clause).getName());
			}
		}

		smie.finishSession(session);
	}

}
