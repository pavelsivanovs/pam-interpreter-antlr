# PAM valodas interpretators
###### Autors: Pavels Ivanovs (st.apl.num.: pi19003)

Valodas PAM interpretators. Izpildīts kursā **Programmēšanas valodu sintakse un semantika**.

- Interpretatoram padodama programma atrodas failā [input.txt](./input.txt).
- Ieejas dati programmai atrodas failā [data.txt](./data.txt)
- Programmu piemēri (_input.txt_) un tām atbilstoši ievaddati (_data.txt_) ir direktorijā [samples](/samples)

Programmas teskta failu un programmas ievaddatu failu var mainīt, nomainot `INPUT` un `DATA` konstanšu vērtībās failā 
[constant.py](./constant.py)

Interpretatora rakstīšanas laikā tika veiktas arī optimizācijas loģiskajām operācijam:
1. Ja konjukcijā kreisa izteiksme jau ir `false`, tad laba izteiksme jau netiek apskatīta, jo jau ir zināms, ka pati konjukcija būs `false`
2. Ja disjukcijā kreisa izteiksme jau ir `true`, tad laba izteiksme jau netiek apskatīta, jo jau ir zināms, ka pati disjukcija būs `true`
