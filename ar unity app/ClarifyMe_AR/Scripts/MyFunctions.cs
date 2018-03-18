using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class MyFunctions : MonoBehaviour {
	
	// Use this for initialization
	void Start () {
	}
	
	public void GoToLink () {

		//FactSheets.factSheet.enabled = true;
		Application.OpenURL("https://clarifyme-s01.herokuapp.com/index.html");
	}

	// Update is called once per frame
	void Update () {
	}
}
