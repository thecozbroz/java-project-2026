# Project Plan (mapped to the CIS 043 rubric)

## Scope check (the rubric's hard limits)
| Requirement | Our plan | Status |
|---|---|---|
| 2-4 screens | MenuScreen, TodoScreen, GpaScreen (3) | OK |
| 2-5 classes, >=1 non-GUI data class | Assignment, AssignmentList, MenuScreen, TodoScreen, GpaScreen (5) | OK, at the max. Nested enum doesn't add a class. Confirm with instructor |
| 3-6 features | 1) Per-class to-do list 2) Add/edit/remove assignments 3) Mark complete (moves out of to-do view) 4) Weighted grade per class 5) Edit category weights (total capped at 100) | OK (5) |
| Must add a new feature if recreating a common app | To-do list is on their sample list; the per-class weighted grade tied to the same data is our addition. Stretch: "score needed on the final to reach X%" | Confirm it counts |
| Cultural/personal relevance | Needs a paragraph in the requirements doc tying this to the team's own experience as students ("Supporting your education" is a listed example) | TODO: write it |
| Inheritance hierarchy diagram | All 3 screens extend JFrame; Assignment/AssignmentList extend Object | Weak, ask the instructor if this is enough |

Dropped to fit limits: **Login** (needs a 4th screen + 2-3 more classes). List it under "Future enhancements" in the doc, which the rubric allows.

## Prototype target
Level 3 (30-60%): to-do and GPA screens work on the SAME shared AssignmentList. Level 1 comes free from the templates (screens open and navigate); Level 2 is the to-do screen working.

## Who does what (graded individually on contribution, so keep it visible in commits/issues)
| Person | Code | Docs |
|---|---|---|
| A | Assignment, AssignmentList (list ops: add/remove/update/getTodoList/markCompleted) | Class UML + inheritance diagram |
| B | AssignmentList grade/weights (calcGPA, changeWeight), GpaScreen | Use case flow chart, functional requirements |
| C | MenuScreen, TodoScreen | GUI design of all screens, cover/TOC/summary, assemble final doc |
| All | Demo (~10 min: intro, live demo in IDE, design overview, reflection, Q&A) | Source code appendix (highlighted) |

Note A and B both edit AssignmentList.java: agree on method signatures first (already in the template) and merge often.

## Final doc checklist
Cover page (name, version, date, team) | TOC | Functional requirements | Design (GUI mockups, inheritance diagram, UML, use case flow chart) | Brief summary | Appendix: source code

## Team decisions to settle
1. Types with no assignments: skip + rescale weights, or count as 0%?
2. Grade counts only completed assignments, or any with a score?
3. Swing (NetBeans GUI builder) assumed; switch to JavaFX only if the instructor prefers.
