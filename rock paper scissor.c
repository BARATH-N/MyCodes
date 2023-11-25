
#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Rock - Paper - Scissor\n");
    printf("How many times you wanna play : \n");
    
    int turns;
    scanf("%d",&turns);
    printf("Enter\n r - rock\n p - paper \n s - scissor\n");
   
    
    int playerScore,computerScore = 0;
    
    char options[3] = {'r', 'p', 's'};
    
    printf("Let's start\n");
    
    while(turns){
        
        printf("%d ",turns);
        char playerInput;
        
        scanf(" %c",&playerInput);
        printf("YOU : %c\n",playerInput);
        
        char computerInput = options[rand()%3];
        printf("Computer : %c\n",computerInput);
        
        if((playerInput == 'r' && computerInput == 's') || 
           (playerInput == 'p' && computerInput == 'r') ||
           (playerInput == 's' && computerInput == 'p') ){
               playerScore++;
           }
        else if((playerInput == 'r' && computerInput == 'r') || 
                (playerInput == 'p' && computerInput == 'p') ||
                (playerInput == 's' && computerInput == 's') ){
             // do Nothing
             // same gesture so no points for either
        }
        else{
            computerScore++;
        }
        turns--;
    }
    printf("Your score is %d , computer's score is %d \n",playerScore,computerScore);
    printf("%s",playerScore>computerScore?" You Won " : " You Lose");

    return 0;
}
