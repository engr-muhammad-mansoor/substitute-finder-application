package com.example.subfinder.Services;

import com.example.subfinder.Entities.GamesTable;
import com.example.subfinder.Entities.UserTable;
import com.example.subfinder.Models.GameModel;
import com.example.subfinder.Models.SubRequestInput;
import com.example.subfinder.Models.UserModel;
import com.example.subfinder.Repositories.GamesTableRepository;
import com.example.subfinder.Repositories.UserTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubRequestService {

    @Autowired
    private UserTableRepository userTableRepository;

    @Autowired
    private GamesTableRepository gamesTableRepository;

    public GameModel createSubRequest(SubRequestInput subRequestInput) {
        UserTable user = new UserTable();
        user.setFirstName(subRequestInput.getFirstName());
        user.setLastName(subRequestInput.getLastName());
        user.setPhoneNumber(subRequestInput.getPhoneNumber());
        user.setGender(subRequestInput.getGender());
        userTableRepository.save(user);
        GamesTable games = new GamesTable();
        games.setGameID(subRequestInput.getGameId());
        games = gamesTableRepository.save(games);
        GameModel model = new GameModel();
        model = model.convertToModel(games);

        return model;
    }
}
