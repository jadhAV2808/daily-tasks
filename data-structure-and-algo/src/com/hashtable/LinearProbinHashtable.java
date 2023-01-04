package com.hashtable;

public class LinearProbinHashtable {
	

	/*
	//private Emp[] linearHashtable;
	private StoredEmp[] linearHashtable;
	
	
	public LinearProbinHashtable() {
		//linearHashtable=new Emp[10];
		linearHashtable=new StoredEmp[10];
	}
	
	
	private int hashKey(String key) {
		return key.length()%linearHashtable.length;
	}
	
	private boolean occupied(int index) {
		return linearHashtable[index]!=null;
	}
	
	public void put(String key,Emp emp) {
		int hashedKey=hashKey(key);
		
		if(occupied(hashedKey)) {
			int stopindex=hashedKey;
			if(hashedKey==linearHashtable.length-1)
				hashedKey=0;
			else
				hashedKey++;
			
			while(occupied(hashedKey) && hashedKey!=stopindex) {
				hashedKey=(hashedKey+1)%linearHashtable.length;
			}
			
		}
		
		if(occupied(hashedKey))
			System.out.println("Sorry, There is already an employee at position "+ hashedKey);
		else
			//linearHashtable[hashedKey]=emp;
			linearHashtable[hashedKey]=new StoredEmp(key,emp);
			
	}
	
	
	private int findKey(String key) {
		int hashedKey=hashKey(key);
		if(linearHashtable[hashedKey]!=null && linearHashtable[hashedKey].key.equals(key))
			return hashedKey;
		
		
			int stopindex=hashedKey;
			if(hashedKey==linearHashtable.length-1)
				hashedKey=0;
			else
				hashedKey++;
			
			while(hashedKey!=stopindex && 
					linearHashtable[hashedKey]!=null &&
					linearHashtable[hashedKey].key.equals(key)) {
				hashedKey=(hashedKey+1)%linearHashtable.length;
			}
			
			if(stopindex==hashedKey)
				return -1;
			else
				return hashedKey;
			
				
	}
	
	public Emp get(String key) {
		//int hashedKey=hashKey(key);
		//return linearHashtable[hashedKey];
		//return linearHashtable[hashedKey];
		
		int hashedKey=findKey(key);
		if(hashedKey==-1)
			return null;
		else
			return linearHashtable[hashedKey].emp;
	}
	
	
	public Emp remove(String key) {
		int hashedKey=findKey(key);
		if(hashedKey==-1)
			return null;
		
		Emp emp=linearHashtable[hashedKey].emp;
		linearHashtable[hashedKey]=null;
		return emp;
		
	
	}
	
	public void printHashtable() {
		for(int i=0;i<linearHashtable.length;i++) {
			if(linearHashtable[i]!=null)
				System.out.println(linearHashtable[i].emp);
			else
				System.out.println("Empty");
		}					
	}
	
	*/
	
	 private StoredEmp[] hashtable;

	    public LinearProbinHashtable() {
	        hashtable = new StoredEmp[10];
	    }

	    public void put(String key, Emp employee) {
	        int hashedKey = hashKey(key);
	        if (occupied(hashedKey)) {
	            int stopIndex = hashedKey;
	            if (hashedKey == hashtable.length - 1) {
	                hashedKey = 0;
	            }
	            else {
	                hashedKey++;
	            }

	            while (occupied(hashedKey) && hashedKey != stopIndex) {
	                hashedKey = (hashedKey + 1) % hashtable.length;
	            }
	        }

	        if (occupied(hashedKey)) {
	            System.out.println("Sorry, there's already an employee at position " + hashedKey);
	        }
	        else {
	            hashtable[hashedKey] = new StoredEmp(key, employee);
	        }
	    }

	    public Emp get(String key) {
	        int hashedKey = findKey(key);
	        if (hashedKey == -1) {
	            return null;
	        }
	        return hashtable[hashedKey].emp;
	    }

	    public Emp remove(String key) {
	        int hashedKey = findKey(key);
	        if (hashedKey == -1) {
	            return null;
	        }

	        Emp employee = hashtable[hashedKey].emp;
	        hashtable[hashedKey] = null;

	        StoredEmp[] oldHashtable = hashtable;
	        hashtable = new StoredEmp[oldHashtable.length];
	        for (int i = 0; i < oldHashtable.length; i++) {
	            if (oldHashtable[i] != null) {
	                put(oldHashtable[i].key, oldHashtable[i].emp);
	            }
	        }

	        return employee;
	    }

	    private int hashKey(String key) {
	        return key.length() % hashtable.length;
	    }

	    private int findKey(String key) {
	        int hashedKey = hashKey(key);
	        if (hashtable[hashedKey] != null &&
	                hashtable[hashedKey].key.equals(key)) {
	            return hashedKey;
	        }

	        int stopIndex = hashedKey;
	        if (hashedKey == hashtable.length - 1) {
	            hashedKey = 0;
	        }
	        else {
	            hashedKey++;
	        }

	        while (hashedKey != stopIndex &&
	                hashtable[hashedKey] != null &&
	                !hashtable[hashedKey].key.equals(key)) {
	            hashedKey = (hashedKey + 1) % hashtable.length;
	        }

	        if (hashtable[hashedKey] != null &&
	                hashtable[hashedKey].key.equals(key)) {
	            return hashedKey;
	        }
	        else {
	            return -1;
	        }

	    }

	    private boolean occupied(int index) {
	        return hashtable[index] != null;
	    }

	    public void printHashtable() {
	        for (int i = 0; i < hashtable.length; i++) {
	            if (hashtable[i] == null) {
	                System.out.println("empty");
	            }
	            else {
	                System.out.println("Position " + i + ": " +hashtable[i].emp);
	            }
	        }
	    }
	

}
