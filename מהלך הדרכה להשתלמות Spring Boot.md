<div dir="rtl">

# מהלך הדרכה להשתלמות Spring Boot

## מפגש ראשון

### שלב 1: אפליקציה בסיסית
- **יצירת אפליקציה ראשונה**
    - יצירת קוד דרך Spring Initializer באתר spring.io
    - יצירת פרויקט דרך IntelliJ IDEA Ultimate
- **הצגת המבנה הבסיסי**
    - סקירת מסמך `00_Intro`
    - הסבר מפורט על החלקים השונים בקוד
- **הדגמות מעשיות**
    - הפעלת האפליקציה וניתוח פלט הקונסול
    - בדיקת התהליך דרך פקודות CMD
    - גישה לאפליקציה דרך דפדפן/Postman
    - בדיקת בקשות HTTP בסיסיות
- **מושגי יסוד**
    - Spring Beans
    - מכלי Spring (Containers)
    - Spring Boot Actuator
- **סיכום**
    - סקירת מסמך `Intro_01.md`
    - מעבר על `Stage1.md` לקראת השלב הבא

### שלב 2: הוספת קונטרולר בסיסי
1. **הוספת שכבת הבקר**
    - הוספת תלות Web לפרויקט
    - יצירת קונטרולר בסיסי
2. **הרצת האפליקציה**
    - קבלת תגובת "Welcome..." מהאנדפוינט
3. **הבנת זרימת בקשות**
    - הצגת תרשים זרימה של DispatcherServlet
4. **העמקה בסביבת Servlet**
    - סקירת מסמך "Servlet ויישומו ב-Spring Boot"
5. **סיכום שלב 2**
    - מעבר על מסמך `Stage2.md`
6. **תרגול מעשי**
    - ביצוע משימת `Mission_01_for_Stage2.md` (15 דקות)

### שלב 3: ארכיטקטורת MVC בסיסית
1. **יישום מעשי**
    - בניית קוד הדגמה לפי תוצאות התרגיל הקודם
    - בניית תרגיל 2 על פי הכללים שנלמדו
2. **סיכום תרגיל**
    - הצגת מסמך "סיום תרגיל ושלב"
3. **הרחבת הידע**
    - סקירת מסמך "מבט הנדסי" על ארכיטקטורה שכבתית
    - הצגת מסמך `Stage3.md` יחד עם מסמך האנוטציות
4. **תרגול מתקדם**
    - ביצוע משימת `Mission_03_for_Stage3.md` (20 דקות)

### שלב 4: CRUD מלא עם שיפורים ארכיטקטוניים
1. **שיפור ופישוט הקוד**
    - הוספת ספריית Lombok להפחתת קוד שגרתי
    - יצירת ממשק לשכבת השירות
    - כתיבת קוד מלא לתרגיל 3
2. **העמקה בעקרונות ארכיטקטוניים**
    - סקירת המדריך המקיף לאפליקציית Spring Boot עם פעולות CRUD
    - דיון ביתרונות השימוש בממשקים
    - הבדלים בין פולימורפיזם להזרקת תלויות (DI)
3. **סיכום שלב 4**
    - מעבר על מסמך `Stage4.md`

---

## מפגש שני

### שלב 5: טיפול בחריגות ושיפור תגובות ה-API
1. **מבוא ל-ResponseEntity**
    - הצגת הצורך ב-ResponseEntity
    - דיון בחשיבות קודי תגובה נכונים
2. **יישום מעשי**
    - ביצוע משימת `Mission_01_for_Stage5`
    - כתיבת הקוד המשופר
3. **העמקה בעיצוב API נכון**
    - סקירת מסמך "ניתוח מתקדם של קוד", סעיף 3 - עיצוב API ונקודות גישה
4. **שיפורים ארכיטקטוניים**
    - הדגמת תיקונים במיפוי הבקר תוך כדי כתיבת הקוד
5. **העמקה ב-ResponseEntity**
    - סקירת השימושים שעשינו ב-ResponseEntity
    - הצגת החשיבות ההנדסית של ResponseEntity ומבנה הקוד
6. **סיכום שלב**
    - הצגת מסמך `Stage5.md`

### שלב 5.1: טיפול גלובלי בחריגות
1. **מנגנון טיפול מרכזי**
    - הצגת מסמך `00_ControllerAdvice_Global_exception.md`
2. **יישום מעשי**
    - כתיבת תיקונים בקוד בהתאם למסמך
    - הדגמת פעולת מנגנון החריגות הגלובלי

### שלב 5.2: ולידציה וטיפול בשגיאות ולידציה
1. **הוספת מנגנוני ולידציה**
    - שילוב אנוטציות ולידציה במודל
    - הרחבת מטפל החריגות הגלובלי
2. **ניתוח מתקדם**
    - הצגת מסמך `02_ניתוח מתקדם של קוד ה-Spring Boot.md`
3. **סיכום**
    - סקירת מסמך `Stage52.md`
    - מבט כולל על פיתוח האפליקציה באמצעות מסמך `Stages.md`

</div>