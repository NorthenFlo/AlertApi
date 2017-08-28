#AlertApi Java JPanel

AlertApi Java JPanel vous permet d'ajouter des alertes comme sur la FrameWork Bootstrap !
L'utilisation de celui-ci est très simple !
Après avoir ajouté la class AlertAPI,
dans la déclaration de votre JPanel;

Ajouter: 

```
add(AlertAPI.AddAlertPanel(xPosition, yPosition, width, height)); 
```

Après avoir déclaré ceci;
Ajouter simplement l'affichage de votre alerte selon le moment où veut l'afficher.

```
AlertHallyosAPI.Show("<html>Votre titre<br /> Message d'alerte</html>", "danger");
```

Le premier argument correspond au titre et au message et le dernier correspondent au status, (Danger, Succès, Infos).

(PARTIE OPTIONNELLE)

Si lorsque vous maximiser votre fenêtre, l'alerte ne suit pas;
D'abord, ajoutez
```
     this.addWindowStateListener(new WindowStateListener() {
	    	public void windowStateChanged(WindowEvent arg0) {
	    	   frame__windowStateChanged(arg0);
	    	}
	    });
```
dans la déclaration de votre Frame et ajouter cette fonction dans la class de votre Frame.

```
public void frame__windowStateChanged(WindowEvent e){
		if ((e.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH){
			AlertAPI.alert_panel.setSize(this.getWidth(), 50);
		}
}
```
