using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class FactSheets : MonoBehaviour {

	public RawImage factSheet;

	// Use this for initialization
	void Start () {
		factSheet.enabled = false;
	}
	
	public void ShowEnglish () {
	}

	public void ShowGerman () {
	}

	public void ShowFactSheet () {
		factSheet.enabled = true;
	}

	public void HideFactSheet () {
		factSheet.enabled = false;
	}

	public void GoToWebApp() {

		//Application.OpenURL("https://clarifyme-s01.herokuapp.com/index.html");
		Application.OpenURL("clarifyme://contract?id=aeebd4ea-6ea5-4bf5-b73d-aa68d13b8608");
	}

	// Update is called once per frame
	void Update () {
		
	}
}
