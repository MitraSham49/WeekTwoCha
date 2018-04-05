package com.example.demo;

public class Program {
    private String skill;
    private String skillRate;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkillRate() {
        return skillRate;
    }

    public void setSkillRate(String skillRate) {
        this.skillRate = skillRate;
    }

    @Override
    public String toString() {
        return (skill + ",  " +
                skillRate  );
    }
}
